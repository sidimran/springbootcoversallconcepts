package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.LibraryDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.ResultDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service.LibraryService;

@RestController
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
public class LibraryController {

	@Autowired
	LibraryService libraryService;

	@PostMapping("/saveLibraryData")
	public ResultDto saveLibraryData(@Valid @RequestBody LibraryDto libraryDto) {
		return libraryService.saveLibrarydata(libraryDto);
	}

}
