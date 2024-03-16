package com.tutorial.mapstruct.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.tutorial.mapstruct.db.entity.Employee;
import com.tutorial.mapstruct.web.dto.EmployeeDto;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
	
	EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);
	
	@Mappings({
		@Mapping(source = "empid",target = "id"),
		@Mapping(source = "firstName",target = "fname")
	})
	EmployeeDto convertoDto(Employee employee);
	
	@Mappings({
		@Mapping(source = "id",target = "empid"),
		@Mapping(source = "fname",target = "firstName")
	})
	Employee convertoEntity(EmployeeDto dto);

}
