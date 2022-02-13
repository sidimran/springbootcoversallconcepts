package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class BooksDto {

	private Long bookId;

	@NotNull(message = "enter Book_name")
	private String bookName;

	@NotNull(message = "Book_Author")
	private String bookAuthor;

	@NotNull(message = "enter Book_Volume")
	private int bookVolume;

	@NotNull(message = "enter Published_Date")
	private Date publishedDate;

}
