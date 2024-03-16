package com.tutorial.mapstruct.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.tutorial.mapstruct.converter.EmployeeMapper;
import com.tutorial.mapstruct.converter.UserMapper;
import com.tutorial.mapstruct.db.entity.Employee;
import com.tutorial.mapstruct.db.entity.User;
import com.tutorial.mapstruct.web.dto.EmployeeDto;
import com.tutorial.mapstruct.web.dto.UserDto;


@Service
public class UserService {
	
	public static Map<String, Object> userMap = new HashMap<>();
	
	//private UserMapper userMapper;
	
	public User addUser(UserDto dto) {
		userMap.put(dto.getUserName(), UserMapper.MAPPER.convertoEntity(dto));
		return (User) userMap.get(dto.getUserName());
	}
	
	public UserDto getUser(String userName) {
		
		return UserMapper.MAPPER.convertoDto((User) userMap.get(userName));
	}
	
	public EmployeeDto addEmp(EmployeeDto dto) {
		Employee emp = EmployeeMapper.MAPPER.convertoEntity(dto);
		emp.setEmpid(Math.random());
		userMap.put(String.valueOf(emp.getEmpid()), emp);
		return EmployeeMapper.MAPPER.convertoDto(emp);
	}
	
	public EmployeeDto getEmployee(double empid) {
		Employee emp = (Employee) userMap.get(String.valueOf(empid));
		return EmployeeMapper.MAPPER.convertoDto(emp);
	}

}
