package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
