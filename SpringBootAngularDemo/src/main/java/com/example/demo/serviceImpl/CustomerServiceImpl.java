package com.example.demo.serviceImpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public void addCustomer(Customer customer) throws IOException {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
	}

	@Override
	public Iterable<Customer> getCustomerDetails() throws IOException {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(long id) throws IOException {
		// TODO Auto-generated method stub
		return customerRepository.findOne(id);
	}

	@Override
	public List<Customer> getCustomerByLastName(String name) throws IOException {
		// TODO Auto-generated method stub
		return customerRepository.findByLastName(name);
	}
	
	@Override
	public List<Customer> getCustomerByFirstName(String name) throws IOException {
		// TODO Auto-generated method stub
		return customerRepository.findByFirstName(name);
	}

}
