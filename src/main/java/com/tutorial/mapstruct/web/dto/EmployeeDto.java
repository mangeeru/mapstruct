package com.tutorial.mapstruct.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

	private double id;

	private String fname;

	private String lastName;

	private int deptNo;

}
