package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Credentials;

@Repository
public interface CredentialsRepository extends JpaRepository<Credentials, Long> {

}
