package com.tutorial.mapstruct.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.tutorial.mapstruct.db.entity.User;
import com.tutorial.mapstruct.web.dto.UserDto;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
	
	UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

	User convertoEntity(UserDto dto, @MappingTarget User user);

	UserDto convertoDto(User user, @MappingTarget UserDto userDto);

	User convertoEntity(UserDto dto);

	UserDto convertoDto(User user);

}
