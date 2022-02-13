package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.converter;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.CredentialsDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.UserDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Credentials;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.User;

@Component
public class UserConverter {

	public User dtoToEntity(UserDto userDto) {

		User user = new User();
		user.setUserId(userDto.getUserId());
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setBirthDate(userDto.getBirthDate());
		user.setEmailAddress(userDto.getEmailAddress());
		user.setLastUpdatedDate(userDto.getLastUpdatedDate());
		user.setLastUpdatedBy(userDto.getLastUpdatedBy());
		user.setCreateDate(userDto.getCreateDate());
		user.setCreatedBy(userDto.getCreatedBy());
		user.setCredentials(userDto.getCredentials());

		return user;
	}

	public List<User> dtoToEntity(List<UserDto> userDto) {
		return userDto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}

	public UserDto entityToDto(User user) {

		UserDto userDto = new UserDto();
		userDto.setUserId(user.getUserId());
		userDto.setFirstName(user.getFirstName());
		userDto.setLastName(user.getLastName());
		userDto.setBirthDate(user.getBirthDate());
		userDto.setEmailAddress(user.getEmailAddress());
		userDto.setLastUpdatedDate(user.getLastUpdatedDate());
		userDto.setLastUpdatedBy(user.getLastUpdatedBy());
		userDto.setCreateDate(user.getCreateDate());
		userDto.setCreatedBy(user.getCreatedBy());
		userDto.setCredentials(user.getCredentials());

		return userDto;
	}

	public List<UserDto> entityToDto(List<User> user) {

		return user.stream().map(this::entityToDto).collect(Collectors.toList());
	}

}
