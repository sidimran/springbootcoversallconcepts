package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Books;

public interface BooksRepository extends JpaRepository<Books, Long> {

}
