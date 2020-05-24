package com.javacodegeeks.jpaexample.service;

import com.javacodegeeks.jpaexample.model.PersonDetails;

import java.util.List;

public interface PersonDetailsService {

    PersonDetails createPersonDetails(PersonDetails personDetails);

    PersonDetails getPersonDetails(Long id);

    PersonDetails editPersonDetails(PersonDetails personDetails);

    void deletePersonDetails(PersonDetails personDetails);

    void deletePersonDetails(Long id);

    List<PersonDetails> getAllPersonDetails(int pageNumber, int pageSize);

    List<PersonDetails> getAllPersonDetails();

    long countPersonDetails();
}
