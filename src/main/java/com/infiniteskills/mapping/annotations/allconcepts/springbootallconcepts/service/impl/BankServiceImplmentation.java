package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.converter.BankConverter;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.BankDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.ResultDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Bank;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.repository.BankRepository;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service.BankService;

@Service
public class BankServiceImplmentation implements BankService {

	@Autowired
	BankRepository bankRepository;

	@Autowired
	BankConverter bankConverter;

	@Override
	public ResultDto saveBankData(BankDto bankDto) {

		Bank bank = bankConverter.dtoToEntity(bankDto);
		bankRepository.save(bank);
		BankDto passBank = bankConverter.entityToDto(bank);
		ResultDto resultDto = new ResultDto();
		resultDto.setMessage("Save Successfully");
		resultDto.setData(passBank);

		return resultDto;
	}

}
