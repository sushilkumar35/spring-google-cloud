package com.javacodegeeks.jpaexample.repository;

import com.javacodegeeks.jpaexample.model.PersonDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDetailsRepository extends JpaRepository<PersonDetails, Long> {
}
