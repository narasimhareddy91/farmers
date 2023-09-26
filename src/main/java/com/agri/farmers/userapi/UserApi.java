package com.agri.farmers.userapi;

import java.net.URI;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.agri.farmers.user.User;
import com.agri.farmers.userapi.UserService;

@RestController
public class UserApi {

	@Autowired private UserService service;
	
	@PutMapping("/agri/users/")
	public ResponseEntity<?> createUser(@RequestBody @Valid User user) {
		User createdUser = service.save(user);
		URI uri = URI.create("/agri/users/" + createdUser.getId());
		
		UserDTO userDto = new UserDTO(createdUser.getId(), createdUser.getEmail());
		
		return ResponseEntity.created(uri).body(userDto);
	}
}
