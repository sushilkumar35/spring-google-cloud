package com.iamvickyav.springboot.SpringBootRestWithH2;

import com.iamvickyav.springboot.SpringBootRestWithH2.model.Employee;
import com.iamvickyav.springboot.SpringBootRestWithH2.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// fetch employee details based on id
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	Employee getEmployee(@PathVariable Integer id) throws Exception {
		return employeeService.getEmployee(id);
	}

	// fetch list of employee details
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	List<Employee> getAllEmployee() throws Exception {
		return employeeService.getAllEmployee();
	}

	@RequestMapping(value = "/employeeSave", method = RequestMethod.PUT)
	@ResponseBody
	String addEmployee(@RequestBody Employee employee) throws Exception {
		System.out.println("Add Employee");
		employeeService.addEmployee(employee);
		return "SUCCESS";
	}

	@RequestMapping(value = "/employeeUpdate", method = RequestMethod.POST)
	Employee updateEmployee(@RequestBody Employee employee) throws Exception {
		Employee updatedEmployee = employeeService.updateEmployee(employee);
		return updatedEmployee;
	}

	// restful web services example
	@RequestMapping(value = "/employeeDelete/{id}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteEmployee(@PathVariable Integer id) throws Exception {
		Employee employee = employeeService.getEmployee(id);
		if (employee == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		employeeService.deleteEmployee(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	// Insert list of employees
	@RequestMapping(value = "/employeesAdd", method = RequestMethod.PUT)
	String addAllEmployees(@RequestBody List<Employee> employeeList) throws Exception {
		employeeService.addAllEmployees(employeeList);
		return "SUCCESS";
	}

	// Update list of employees
	@RequestMapping(value = "/employeesUpdate", method = RequestMethod.POST)
	String updateAllEmployees(@RequestBody List<Employee> employeeList) throws Exception {
		employeeService.updateAllEmployees(employeeList);
		return "SUCCESS";
	}
	//Delete all employees
	@RequestMapping(value = "/employeesDelete", method = RequestMethod.DELETE)
	String addAllEmployees() throws Exception {
		employeeService.deleteAllEmployees();
		return "SUCCESS";
	}
}
