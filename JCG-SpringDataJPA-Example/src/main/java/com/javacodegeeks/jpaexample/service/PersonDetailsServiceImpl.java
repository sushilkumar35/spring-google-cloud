package com.javacodegeeks.jpaexample.service;

import com.javacodegeeks.jpaexample.model.PersonDetails;
import com.javacodegeeks.jpaexample.repository.PersonDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonDetailsServiceImpl implements PersonDetailsService {

    @Autowired
    private PersonDetailsRepository personDetailsRepository;

    @Override
    public PersonDetails createPersonDetails(PersonDetails personDetails) {
        return personDetailsRepository.save(personDetails);
    }

    @Override
    public PersonDetails getPersonDetails(Long id) {
        return personDetailsRepository.findOne(id);
    }

   
	@Override
	public List<PersonDetails> getAllPersonDetails(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return personDetailsRepository.findAll(new PageRequest(pageNumber, pageSize)).getContent();
	}

	@Override
	public List<PersonDetails> getAllPersonDetails() {
		// TODO Auto-generated method stub
		return personDetailsRepository.findAll();
	}

	@Override
	public long countPersonDetails() {
		// TODO Auto-generated method stub
		return personDetailsRepository.count();
	}

	@Override
	public PersonDetails editPersonDetails(PersonDetails personDetails) {
		// TODO Auto-generated method stub
		return personDetailsRepository.save(personDetails);
	}

	@Override
	public void deletePersonDetails(PersonDetails personDetails) {
		// TODO Auto-generated method stub
		personDetailsRepository.delete(personDetails);
		
	}

	@Override
	public void deletePersonDetails(Long id) {
		// TODO Auto-generated method stub
		personDetailsRepository.delete(id);
	}
}
