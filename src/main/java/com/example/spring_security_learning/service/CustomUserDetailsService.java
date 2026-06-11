package com.example.spring_security_learning.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.spring_security_learning.repo.UserDetailsRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDetailsRepo userDetailsRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		return userDetailsRepo.findByUserName(username)
				.orElseThrow(()-> new UsernameNotFoundException("username not found"));
	}

}
