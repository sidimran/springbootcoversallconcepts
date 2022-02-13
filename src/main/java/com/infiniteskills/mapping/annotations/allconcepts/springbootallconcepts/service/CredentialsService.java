package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.CredentialsDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.ResultDto;

public interface CredentialsService {
	
	public ResultDto saveCredentials(CredentialsDto credentialsDto);

}
