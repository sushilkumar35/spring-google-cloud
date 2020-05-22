package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import com.example.demo.model.Customer;

public interface CustomerService {
	void addCustomer(Customer customer) throws IOException;

	Iterable<Customer> getCustomerDetails() throws IOException;

	Customer getCustomerById(long id) throws IOException;

	List<Customer> getCustomerByLastName(String name) throws IOException;
	
	List<Customer> getCustomerByFirstName(String name) throws IOException;

}
