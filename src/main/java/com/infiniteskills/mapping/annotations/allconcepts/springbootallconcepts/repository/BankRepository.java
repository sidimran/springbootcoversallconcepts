package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Bank;

public interface BankRepository extends JpaRepository<Bank, Long> {

}
