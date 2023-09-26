package com.agri.farmers.user;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.agri.farmers.user.Role;
import com.agri.farmers.user.RoleRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class RoleRepositoryTests {
	@Autowired private RoleRepository repo;
	
	@Test
	public void testCreateRoles() {
		Role admin = new Role("ROLE_ADMIN");
		Role farmer = new Role("ROLE_FARMER");
		Role agriagent = new Role("ROLE_AGRIAGENT");
		
		repo.saveAll(List.of(admin, farmer, agriagent));
		
		long count = repo.count();
		assertEquals(3, count);
	}
}

