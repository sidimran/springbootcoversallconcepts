package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class LibraryDto {
	
	private Long libraryId;
    
	@NotNull(message = "enter Library_Name ")
	private String libraryname;

	@NotNull(message =   "Library_Address")
	private String libraryAddress;


}
