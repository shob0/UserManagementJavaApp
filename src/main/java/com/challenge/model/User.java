package com.challenge.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="USER")
public class User {

	@Id
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String contactNo;
	
	@OneToOne
	@JoinColumn(name="role")
	private Role role;
	
	
}
