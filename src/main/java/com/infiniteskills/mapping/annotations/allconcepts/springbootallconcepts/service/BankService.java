package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.BankDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.ResultDto;

public interface BankService {

	public ResultDto saveBankData(BankDto bankDto);

}
