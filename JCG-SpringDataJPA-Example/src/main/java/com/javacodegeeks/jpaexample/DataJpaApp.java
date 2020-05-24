package com.javacodegeeks.jpaexample;

import com.javacodegeeks.jpaexample.model.PersonDetails;
import com.javacodegeeks.jpaexample.service.PersonDetailsService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataJpaApp implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger("LOGGER");

	@Autowired
	private PersonDetailsService service;

	public static void main(String[] args) {
		SpringApplication.run(DataJpaApp.class, args);
	}

	@Override
	public void run(String... strings) {

		LOG.info("Current objects in DB: {}", service.countPersonDetails());

		PersonDetails person = service.createPersonDetails(new PersonDetails(101L,"BABA", 23));
		LOG.info("Person created in DB : {}", person);

		PersonDetails person1 = service.createPersonDetails(new PersonDetails(102L,"ALOK", 23));
		LOG.info("Person created in DB : {}", person1);
		
		PersonDetails person2 = service.createPersonDetails(new PersonDetails(103L,"RATNA", 23));
		LOG.info("Person created in DB : {}", person2);
		
		LOG.info("Current objects in DB: {}", service.countPersonDetails());

		person.setName("Programmer");
		PersonDetails editedPerson = service.editPersonDetails(person);
		LOG.info("Person edited in DB  : {}", editedPerson);

		List<PersonDetails> getPersonDetails = service.getAllPersonDetails();
		LOG.info("Person edited in DB  : {}", getPersonDetails.size());
		for(PersonDetails p : getPersonDetails) {
			
			LOG.info("ID ************ : {} ", p.getId());
			LOG.info("NAME ***********: {} ", p.getName());
			LOG.info("AGE ************: {} ", p.getAge());
		}

		
//		service.deletePersonDetails(person);
//		LOG.info("After deletion, count: {}", service.countPersonDetails());
	}
}
