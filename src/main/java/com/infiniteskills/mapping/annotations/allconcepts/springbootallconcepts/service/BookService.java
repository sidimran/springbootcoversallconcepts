package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.service;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.BooksDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.ResultDto;

public interface BookService {

	public ResultDto saveBookData(BooksDto booksDto);

}
