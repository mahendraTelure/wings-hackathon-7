package com.wingshackathon7.BeyondLimitsEdu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wingshackathon7.BeyondLimitsEdu.model.User;
import com.wingshackathon7.BeyondLimitsEdu.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class UserController {
	@Autowired(required=true)
	UserRepository userRepository;
	
	@GetMapping("/user")
	public List<User> getMethodName() {
		return userRepository.findAll();
	}
	
	@PostMapping("/user")
	public User postMethodName(@RequestBody User user) {
		//TODO: process POST request
		
		return userRepository.save(user);
	}
	
	
}
