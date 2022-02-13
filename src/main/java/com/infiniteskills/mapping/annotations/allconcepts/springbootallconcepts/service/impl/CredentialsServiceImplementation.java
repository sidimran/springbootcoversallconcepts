package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.converter.CredentialsConverter;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.CredentialsDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.ResultDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Credentials;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.repository.CredentialsRepository;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service.CredentialsService;

@Service
public class CredentialsServiceImplementation implements CredentialsService {

	@Autowired
	CredentialsRepository credentialsRepository;

	@Autowired
	CredentialsConverter credentialsConverter;

	@Override
	public ResultDto saveCredentials(CredentialsDto credentialsDto) {
		Credentials credentials = credentialsConverter.dtoToEntity(credentialsDto);
		credentialsRepository.save(credentials);
		CredentialsDto credentialsDto2 = credentialsConverter.entityToDto(credentials);
		ResultDto resultDto = new ResultDto();
		resultDto.setMessage("Stored successfully");
		resultDto.setData(credentialsDto2);

		return resultDto;
	}

}
