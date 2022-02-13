package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.LibraryDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Library;

@Component
public class LibraryConverter {

	public Library dtoToEntity(LibraryDto libraryDto) {

		Library library = new Library();
		library.setLibraryId(libraryDto.getLibraryId());
		library.setLibraryname(libraryDto.getLibraryname());
		library.setLibraryAddress(libraryDto.getLibraryAddress());

		return library;
	}

	public List<Library> dtoToEntity(List<LibraryDto> libraryDto) {
		return libraryDto.stream().map(this::dtoToEntity).collect(Collectors.toList());

	}

	public LibraryDto entityToDto(Library library) {

		LibraryDto libraryDto = new LibraryDto();
		libraryDto.setLibraryId(library.getLibraryId());
		libraryDto.setLibraryname(library.getLibraryname());
		libraryDto.setLibraryAddress(libraryDto.getLibraryAddress());
		return libraryDto;
	}

	public List<LibraryDto> entityToDto(List<Library> library) {

		return library.stream().map(this::entityToDto).collect(Collectors.toList());
	}
}
