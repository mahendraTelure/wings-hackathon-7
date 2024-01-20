package com.wingshackathon7.BeyondLimitsEdu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wingshackathon7.BeyondLimitsEdu.model.User;
import com.wingshackathon7.BeyondLimitsEdu.repo.UserRepo;



@Service
public class UserService {

	@Autowired(required=true)
	UserRepo UserRepo;
	
	public User addUser(User user) {
		return UserRepo.save(user);
		
	}
}
