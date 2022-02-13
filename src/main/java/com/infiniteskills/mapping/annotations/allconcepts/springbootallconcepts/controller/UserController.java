package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.ResultDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.UserDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service.UserService;

@RestController
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/saveUserData")
	public ResultDto saveUser(@Valid @RequestBody UserDto userDto) {
		return userService.saveUserData(userDto);
	}
	
	@PutMapping("/updateUserData")
	public ResultDto updateUserData(@Valid @RequestBody UserDto userDto) {
		return userService.updateUserData(userDto); 
	}
	
	@GetMapping("/getUserDataById/{id}")
	public ResultDto getUserDataById(@PathVariable(value = "id")int id) {
		return userService.getUserDataById(id);
	}

}
