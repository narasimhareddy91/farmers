package com.agri.farmers.user;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.annotation.Rollback;

import com.agri.farmers.user.Role;
import com.agri.farmers.user.User;
import com.agri.farmers.user.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

	@Autowired private UserRepository repo;
	
	@Test
	public void testCreateUser() {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password = passwordEncoder.encode("perfagriagent");
		
		User newUser = new User("perfagriagent@agri.com", password);
		User savedUser = repo.save(newUser);
		
		assertThat(savedUser).isNotNull();
		assertThat(savedUser.getId()).isGreaterThan(0);
	}
	
	@Test
	public void testAssignRoleToUser() {
		Integer userId = 3;
		Integer roleId = 3;
		User user = repo.findById(userId).get();
		user.addRole(new Role(roleId));
		
		User updatedUser = repo.save(user);
		assertThat(updatedUser.getRoles()).hasSize(1);
		
	}
}

