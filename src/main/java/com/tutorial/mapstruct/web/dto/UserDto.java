package com.tutorial.mapstruct.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	private String userName;
	private String password;
	private String email;
	private String phone;

}
