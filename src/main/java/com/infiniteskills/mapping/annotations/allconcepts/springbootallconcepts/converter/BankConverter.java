package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.converter;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.BankDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Bank;

@Component
public class BankConverter {

	public Bank dtoToEntity(BankDto bankDto) {

		Bank bank = new Bank();
		bank.setBankId(bankDto.getBankId());
		bank.setBankName(bankDto.getBankName());
		bank.setCreatedDate(bankDto.getCreatedDate());
		bank.setCreatedBy(bankDto.getCreatedBy());
		bank.setLastUpdatedDate(bankDto.getLastUpdatedDate());
		bank.setLastupdatedBy(bankDto.getLastupdatedBy());
		bank.setAddress(bankDto.getAddress());
		bank.setContact(bankDto.getContact());

		return bank;
	}

	public List<Bank> dtoToEntity(List<BankDto> bankDto) {
		return bankDto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}

	public BankDto entityToDto(Bank bank) {

		BankDto bankDto = new BankDto();
		bankDto.setBankId(bank.getBankId());
		bankDto.setBankName(bank.getBankName());
		bankDto.setCreatedDate(bank.getCreatedDate());
		bankDto.setCreatedBy(bank.getCreatedBy());
		bankDto.setLastUpdatedDate(bank.getLastUpdatedDate());
		bankDto.setLastupdatedBy(bank.getLastupdatedBy());
		bankDto.setAddress(bank.getAddress());
		bankDto.setContact(bank.getContact());

		return bankDto;
	}

	public List<BankDto> entityToDto(List<Bank> bank) {

		return bank.stream().map(this::entityToDto).collect(Collectors.toList());
	}

}
