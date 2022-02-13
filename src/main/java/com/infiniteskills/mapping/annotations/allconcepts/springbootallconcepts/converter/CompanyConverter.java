package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.BranchDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.CompanyDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Branch;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Company;

@Component
public class CompanyConverter {

	public Company dtoToEntity(CompanyDto companyDto) {

		Company company = new Company();
		company.setCompanyId(companyDto.getCompanyId());
		company.setCompanyName(companyDto.getCompanyName());
		company.setStartedDate(companyDto.getStartedDate());
		company.setBranchList(companyDto.getBranchList());


		return company;
	}

	public List<Company> dtoToEntity(List<CompanyDto> companyDto) {
		return companyDto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}

	public CompanyDto entityToDto(Company company) {

		CompanyDto companyDto = new CompanyDto();
		companyDto.setCompanyId(company.getCompanyId());
		companyDto.setCompanyName(company.getCompanyName());
		companyDto.setStartedDate(company.getStartedDate());
		companyDto.setBranchList(company.getBranchList());

		return companyDto;
	}

	public List<CompanyDto> entityToDto(List<Company> company) {
		return company.stream().map(this::entityToDto).collect(Collectors.toList());
	}

}
