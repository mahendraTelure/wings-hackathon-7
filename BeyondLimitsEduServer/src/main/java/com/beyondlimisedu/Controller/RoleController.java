package com.beyondlimisedu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beyondlimisedu.Model.Role;
import com.beyondlimisedu.Repository.RoleRepository;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class RoleController {
	
	@Autowired
	RoleRepository roleRepository;
	
	@PostMapping("/role")
	public Role createRole(Role role) {
		return roleRepository.save(role);
	}
	
	
}
