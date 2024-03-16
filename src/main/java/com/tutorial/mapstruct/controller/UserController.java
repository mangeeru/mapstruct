package com.tutorial.mapstruct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.mapstruct.db.entity.User;
import com.tutorial.mapstruct.service.UserService;
import com.tutorial.mapstruct.web.dto.EmployeeDto;
import com.tutorial.mapstruct.web.dto.UserDto;

@RestController
@RequestMapping("/app")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/add-user")
	public User addUser(@RequestBody UserDto dto) {
		return userService.addUser(dto);
	}
	
	@GetMapping("/get-user/{userName}")
	public UserDto getUser(@PathVariable String userName) {
		return userService.getUser(userName);
	}
	
	@PostMapping("/add-emp")
	public EmployeeDto addEmp(@RequestBody EmployeeDto dto) {
		return userService.addEmp(dto);
	}
	
	@GetMapping("/get-emp/{empid}")
	public EmployeeDto getEmp(@PathVariable double empid) {
		return userService.getEmployee(empid);
	}

}
