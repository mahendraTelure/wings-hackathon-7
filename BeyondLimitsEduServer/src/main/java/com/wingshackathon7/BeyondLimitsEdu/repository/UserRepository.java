package com.wingshackathon7.BeyondLimitsEdu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wingshackathon7.BeyondLimitsEdu.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
