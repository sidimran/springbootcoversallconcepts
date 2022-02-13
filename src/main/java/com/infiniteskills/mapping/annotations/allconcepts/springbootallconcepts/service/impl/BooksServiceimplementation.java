package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.converter.BooksConverter;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.BooksDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.ResultDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Books;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.repository.BooksRepository;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service.BookService;

@Service
public class BooksServiceimplementation implements BookService {

	@Autowired
	BooksRepository booksRepository;

	@Autowired
	BooksConverter booksConverter;

	@Override
	public ResultDto saveBookData(BooksDto booksDto) {

		Books books = booksConverter.dtoToEntity(booksDto);
		booksRepository.save(books);
		BooksDto passBooksDto = booksConverter.entityToDto(books);
		ResultDto resultDto = new ResultDto();
		resultDto.setMessage("saved successfully");
		resultDto.setData(passBooksDto);
		return resultDto;
	}

}
