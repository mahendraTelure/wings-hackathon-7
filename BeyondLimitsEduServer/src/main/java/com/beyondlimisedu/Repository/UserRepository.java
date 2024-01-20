package com.beyondlimisedu.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beyondlimisedu.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
//	find user by username
	public User findByUsernameAndPassword(String username, String password);


}
