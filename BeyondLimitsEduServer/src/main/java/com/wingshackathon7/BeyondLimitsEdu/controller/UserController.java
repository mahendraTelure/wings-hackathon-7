package com.wingshackathon7.BeyondLimitsEdu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wingshackathon7.BeyondLimitsEdu.model.User;
import com.wingshackathon7.BeyondLimitsEdu.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {
	
	@Autowired(required=true)
	UserService userService;
	
	
	@PostMapping("/")
	public ResponseEntity<User> add(@RequestBody User user){
		return ResponseEntity.ok(this.userService.addUser(user));
	}
}
