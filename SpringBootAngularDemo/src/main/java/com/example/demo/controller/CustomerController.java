package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.message.Response;
import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

/**
 * @author EX_SKumar
 *
 */
@RestController
public class CustomerController {
	@Autowired
	public CustomerService customerService;

	@RequestMapping(value = "/postcustomer", method = RequestMethod.POST)
	public void postCustomer(@RequestBody Customer customer) throws IOException {
		customerService.addCustomer(customer);
	}

	@RequestMapping(value = "/customerdetails", method = RequestMethod.GET)
	public Response getCustomerDetails() throws IOException {
		Iterable<Customer> customerDetails = customerService.getCustomerDetails();
		return new Response("Done", customerDetails);
	}

	@RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
	public Response getCustomerById(@PathVariable("id") long id) throws IOException {
		Customer custmer = customerService.getCustomerById(id);
		return new Response("Done", custmer);
	}

	@RequestMapping(value = "/findbylastname", method = RequestMethod.GET)
	public Response getCustomerByLastName(@RequestParam("lastName") String lastName) throws IOException {
		List<Customer> custmer = customerService.getCustomerByLastName(lastName);
		return new Response("Done", custmer);
	}
	
	@RequestMapping(value = "/findbyfirstname", method = RequestMethod.GET)
	public Response getCustomerByFirstName(@RequestParam("firstName") String firstName) throws IOException {
		//System.out.println("Testing ****"+firstName);
		List<Customer> custmer = customerService.getCustomerByFirstName(firstName);
		return new Response("Done", custmer);
	}
}
