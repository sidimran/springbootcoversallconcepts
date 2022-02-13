package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.CredentialsDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.UserDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Credentials;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.User;

@Component
public class CredentialsConverter {

	public Credentials dtoToEntity(CredentialsDto credentialsDto) {

		Credentials credentials = new Credentials();
		credentials.setCredentialId(credentialsDto.getCredentialId());
		credentials.setUserName(credentialsDto.getUserName());
		credentials.setPassword(credentialsDto.getPassword());
		//credentials.setUser(credentialsDto.getUser());


		return credentials;

	}

	public List<Credentials> dtoToEntity(List<CredentialsDto> credentialsDto) {
		return credentialsDto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}

	public CredentialsDto entityToDto(Credentials credentials) {

		CredentialsDto credentialsDto = new CredentialsDto();
		credentialsDto.setCredentialId(credentials.getCredentialId());
		credentialsDto.setUserName(credentials.getUserName());
		credentialsDto.setPassword(credentials.getPassword());
		//credentialsDto.setUser(credentials.getUser());



		return credentialsDto;
	}

	public List<CredentialsDto> entityToDto(List<Credentials> credentials) {
		return credentials.stream().map(this::entityToDto).collect(Collectors.toList());
	}
}
