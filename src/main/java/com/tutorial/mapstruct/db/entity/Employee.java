package com.tutorial.mapstruct.db.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private double empid;
	
	private String firstName;
	
	private String lastName;
	
	private int deptNo;

}
