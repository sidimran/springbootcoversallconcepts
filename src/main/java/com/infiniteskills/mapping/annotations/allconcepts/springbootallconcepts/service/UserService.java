package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.ResultDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.UserDto;

public interface UserService {

	public ResultDto saveUserData(UserDto userDto);

	public ResultDto updateUserData(UserDto userDto);
	
	public ResultDto getUserDataById(int id);
}
