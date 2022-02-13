package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.converter.CompanyConverter;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.CompanyDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.ResultDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Company;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.repository.CompanyRepository;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service.CompanyService;

@Service
public class CompanyServiceImplementation implements CompanyService {

	@Autowired
	CompanyRepository companyRepository;

	@Autowired
	CompanyConverter companyConverter;

	@Override
	public ResultDto saveCompanyData(CompanyDto companyDto) {

		Company company = companyConverter.dtoToEntity(companyDto);
		companyRepository.save(company);
		CompanyDto passEmployeeDto = companyConverter.entityToDto(company);
		ResultDto resultDto = new ResultDto();
		resultDto.setMessage("saved successfully");
		resultDto.setData(passEmployeeDto);
		return resultDto;
	}

}
