package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service.impl;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.converter.UserConverter;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.ResultDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.UserDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.User;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.repository.UserRepository;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service.UserService;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserConverter userConverter;

	@Override
	public ResultDto saveUserData(UserDto userDto) {

		User user = userConverter.dtoToEntity(userDto);
		userRepository.save(user);
		UserDto passUserDto = userConverter.entityToDto(user);
		ResultDto resultDto = new ResultDto();
		resultDto.setMessage("Stored successfully");
		resultDto.setData(passUserDto);

		return resultDto;
	}

	@Override
	public ResultDto updateUserData(UserDto userDto) {

		ResultDto resultDto = new ResultDto();
		Optional<User> user = userRepository.findById(userDto.getUserId());
		if (user.isEmpty()) {
			resultDto.setMessage("ID does not exist");
		}

		User passUser = user.get();
		if (Objects.nonNull(userDto.getFirstName()) && !"".equalsIgnoreCase(userDto.getFirstName())) {
			passUser.setFirstName(userDto.getFirstName());
		}

		if (Objects.nonNull(userDto.getLastName()) && !"".equalsIgnoreCase(userDto.getLastName())) {
			passUser.setLastName(userDto.getLastName());
		}

		if (Objects.nonNull(userDto.getBirthDate())) {
			passUser.setBirthDate(userDto.getBirthDate());
		}

		if (Objects.nonNull(userDto.getEmailAddress()) && !"".equalsIgnoreCase(userDto.getEmailAddress())) {
			passUser.setEmailAddress(userDto.getEmailAddress());
		}

		if (Objects.nonNull(userDto.getLastUpdatedDate())) {
			passUser.setLastUpdatedDate(userDto.getLastUpdatedDate());
		}

		if (Objects.nonNull(userDto.getLastUpdatedBy()) && !"".equalsIgnoreCase(userDto.getLastUpdatedBy())) {
			passUser.setLastUpdatedBy(userDto.getLastUpdatedBy());
		}

		if (Objects.nonNull(userDto.getCreateDate())) {
			passUser.setCreateDate(userDto.getCreateDate());
		}

		if (Objects.nonNull(userDto.getCreatedBy()) && !"".equalsIgnoreCase(userDto.getCreatedBy())) {
			passUser.setCreatedBy(userDto.getCreatedBy());

			User sendUser = userRepository.save(passUser);
			UserDto userDto2 = userConverter.entityToDto(sendUser);
			resultDto.setMessage("updated successfully");
			resultDto.setData(userDto2);

		}

		return resultDto;
	}

	@Override
	public ResultDto getUserDataById(int id) {
		ResultDto resultDto = new ResultDto();
		Optional<User> user = userRepository.findById((long) id);

		if (user.get().getUserId() != id) {
			resultDto.setMessage("Invalid Id");

		} else {
			UserDto userDto = userConverter.entityToDto(user.get());
			resultDto.setData(userDto);
		}
		return resultDto;
	}

}
