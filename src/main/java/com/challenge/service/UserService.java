package com.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.challenge.dao.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public void save() {
		// TODO Auto-generated method stub

	}
	
	public void update() {
		// TODO Auto-generated method stub

	}
	
	public void delete() {
		// TODO Auto-generated method stub

	}
	
	public void list() {
		// TODO Auto-generated method stub

	}

}
