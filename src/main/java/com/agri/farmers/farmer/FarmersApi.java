package com.agri.farmers.farmer;

import java.net.URI;
import java.util.List;

import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agri/farmers")

public class FarmersApi {
	
@Autowired private FarmersRepository repo;
	
	@PostMapping
	@RolesAllowed("ROLE_ADMIN")
	//@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<Farmers> create(@RequestBody @Valid Farmers farmers) {
		Farmers savedProduct = repo.save(farmers);
		URI productURI = URI.create("agri/farmers" + savedProduct.getId());
		return ResponseEntity.created(productURI).body(savedProduct);
	}
	
	@GetMapping
	@RolesAllowed({"ROLE_ADMIN", "ROLE_FARMER", "ROLE_AGRIAGENT" })
	//@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_ADMIN') or hasRole('ROLE_AGRIAGENT')")
	public List<Farmers> list() {
		return repo.findAll();
	}

}
