package com.challenge.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "ROLE")
public class Role {

	@Id
	private long id;
	private String role;
}
