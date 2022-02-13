package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.converter.LibraryConverter;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.LibraryDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.ResultDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Library;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.repository.LibraryRepository;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service.LibraryService;

@Service
public class LibraryServiceimplementation implements LibraryService {

	@Autowired
	LibraryRepository libraryRepository;

	@Autowired
	LibraryConverter libraryConverter;

	@Override
	public ResultDto saveLibrarydata(LibraryDto libraryDto) {

		Library library = libraryConverter.dtoToEntity(libraryDto);
		libraryRepository.save(library);
		LibraryDto passLibraryDto = libraryConverter.entityToDto(library);

		ResultDto resultDto = new ResultDto();
		resultDto.setMessage("saved successfully");
		resultDto.setData(passLibraryDto);

		return resultDto;
	}

}
