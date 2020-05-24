package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employees;
	
@RestController
public class EmployeeController {
	
	@RequestMapping("/")
    public List<Employees> getEmployees() 
    {
		System.out.println("***********Inside Controller Class*******************");
		List<Employees> employeesList = new ArrayList<Employees>();
		employeesList.add(new Employees(1,"lokesh","gupta","howtodoinjava@gmail.com"));
		return employeesList;
    }

}
