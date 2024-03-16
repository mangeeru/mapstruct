package com.tutorial.mapstruct.db.entity;

import lombok.Data;

@Data
public class User {
	
	private String userName;
	private String password;
	private String email;
	private String phone;

}
