package com.challenge.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.model.User;

import lombok.extern.slf4j.Slf4j;


@RestController @Slf4j
@RequestMapping("/users")
public class UserServiceImpl {
	
	@PutMapping("/createuser")
	public String createUser(@RequestBody User user) {
		log.info(user.getFirstName());
		return "success";
	}
	
	@PostMapping("/updateuser")
	public void updateUser() {

	}
	
	@DeleteMapping("/deleteuser")
	public void deleteUser() {

	}
	
	//Read User
	@GetMapping("/listusers")
	public String listUser() {
		log.info("inside list users");
		return "Success";
	}
	
	
	
	

	
}
