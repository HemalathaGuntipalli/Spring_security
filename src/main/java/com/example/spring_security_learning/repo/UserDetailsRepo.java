package com.example.spring_security_learning.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_security_learning.entity.Users;

@Repository
public interface UserDetailsRepo extends JpaRepository <Users, Long>{

	Optional<Users> findByUserName(String userName);
}