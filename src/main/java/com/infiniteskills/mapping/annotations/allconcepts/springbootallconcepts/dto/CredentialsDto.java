package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto;

import javax.validation.constraints.NotNull;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.User;

import lombok.Data;

@Data
public class CredentialsDto {

	private Long credentialId;

	@NotNull(message = "enter User_Name")
	private String userName;

	@NotNull(message = "enter password")
	private String password;

	private User user;

}
