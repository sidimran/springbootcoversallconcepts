package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.CompanyDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.ResultDto;

public interface CompanyService {

	public ResultDto saveCompanyData(CompanyDto companyDto);

}
