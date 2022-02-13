package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.BooksDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Books;

@Component
public class BooksConverter {

	public Books dtoToEntity(BooksDto booksDto) {

		Books books = new Books();
		books.setBookId(booksDto.getBookId());
		books.setBookName(booksDto.getBookName());
		books.setBookAuthor(booksDto.getBookAuthor());
		books.setBookVolume(booksDto.getBookVolume());
		books.setPublishedDate(booksDto.getPublishedDate());

		return books;
	}

	public List<Books> dtoToEntity(List<BooksDto> booksDto) {
		return booksDto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}

	public BooksDto entityToDto(Books books) {

		BooksDto booksDto = new BooksDto();
		booksDto.setBookId(books.getBookId());
		booksDto.setBookName(books.getBookName());
		booksDto.setBookAuthor(books.getBookAuthor());
		booksDto.setBookVolume(books.getBookVolume());
		booksDto.setPublishedDate(books.getPublishedDate());

		return booksDto;
	}

	public List<BooksDto> entityToDto(List<Books> books) {
		return books.stream().map(this::entityToDto).collect(Collectors.toList());
	}

}
