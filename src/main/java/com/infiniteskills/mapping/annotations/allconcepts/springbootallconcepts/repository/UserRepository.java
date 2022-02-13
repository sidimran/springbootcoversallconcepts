package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
