/**
 * 
 */
package com.iamvickyav.springboot.SpringBootRestWithH2.service;

import java.util.List;
import com.iamvickyav.springboot.SpringBootRestWithH2.model.Employee;

/**
 * @author EX_SKumar
 *
 */
public interface EmployeeService {
	Employee getEmployee(Integer id) throws Exception;

	void addEmployee(Employee employee) throws Exception;

	Employee updateEmployee(Employee employee) throws Exception;

	void deleteEmployee(Integer id) throws Exception;

	List<Employee> getAllEmployee() throws Exception;

	void addAllEmployees(List<Employee> employeeList) throws Exception;
	
	List<Employee> updateAllEmployees(List<Employee> employeeList) throws Exception;
	
	String deleteAllEmployees() throws Exception;

}
