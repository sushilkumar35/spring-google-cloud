package com.iamvickyav.springboot.SpringBootRestWithH2.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamvickyav.springboot.SpringBootRestWithH2.Repository.EmployeeRepository;
import com.iamvickyav.springboot.SpringBootRestWithH2.model.Employee;
import com.iamvickyav.springboot.SpringBootRestWithH2.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee getEmployee(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return employeeRepository.findOne(id);
	}

	@Override
	public void addEmployee(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Integer id) throws Exception {
		// TODO Auto-generated method stub
		employeeRepository.delete(id);
	}

	@Override
	public List<Employee> getAllEmployee() throws Exception {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public void addAllEmployees(List<Employee> employeeList) throws Exception {
		// TODO Auto-generated method stub
		employeeRepository.save(employeeList);

	}

	public List<Employee> updateAllEmployees(List<Employee> employeeList) throws Exception {
		// TODO Auto-generated method stub
		return employeeRepository.save(employeeList);

	}

	@Override
	public String deleteAllEmployees() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
