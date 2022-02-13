package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.BankDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.ResultDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service.BankService;

@RestController
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
public class BankController {

	@Autowired
	BankService bankService;

	@PostMapping("/saveBankData")
	public ResultDto saveBankData(@Valid @RequestBody BankDto bankDto) {
		return bankService.saveBankData(bankDto);
	}

}
