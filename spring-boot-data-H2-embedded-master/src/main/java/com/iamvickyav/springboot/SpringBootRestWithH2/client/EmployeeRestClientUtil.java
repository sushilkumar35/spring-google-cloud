/**
 * 
 */
package com.iamvickyav.springboot.SpringBootRestWithH2.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.iamvickyav.springboot.SpringBootRestWithH2.model.Employee;

/**
 * @author EX_SKumar
 *
 */
public class EmployeeRestClientUtil {

	/**
	 * @param args
	 */

	public void getEmployeeByIdDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8095/employee/{id}";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Employee> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
				Employee.class, 2);
		Employee employee = responseEntity.getBody();
		System.out.println("Id:" + employee.getId() + ", Title:" + employee.getName());
	}

	public void getAllEmployeesDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8095/employees";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Employee[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
				Employee[].class);
		Employee[] employeeList = responseEntity.getBody();
		for (Employee employee : employeeList) {
			System.out.println("Id**************" + employee.getId() + ", Title*************" + employee.getName());
		}
	}

	public void addEmployeeDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8095/employeeSave";
		Employee objArticle = new Employee();
		objArticle.setId(6);
		objArticle.setName("Spring TEST7");
		HttpEntity<Employee> requestEntity = new HttpEntity<Employee>(objArticle, headers);
		restTemplate.put(url, requestEntity);
		// System.out.println(uri.getPath());
	}

	public void updateEmployeeDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8095/employeeUpdate";
		Employee objArticle = new Employee();
		objArticle.setId(6);
		objArticle.setName("Spring TEST8");
		HttpEntity<Employee> requestEntity = new HttpEntity<Employee>(objArticle, headers);
		restTemplate.postForLocation(url, requestEntity);
		// System.out.println(uri.getPath());
	}

	
	public void addEmployeeListDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8095/employeesAdd";
		List<Employee> empList = new ArrayList<Employee>();
		Employee objArticle = new Employee();
		objArticle.setId(6);
		objArticle.setName("Spring TEST7");
		empList.add(objArticle);
		
		objArticle = new Employee();
		objArticle.setId(7);
		objArticle.setName("Spring TEST7");
		empList.add(objArticle);
		
		objArticle = new Employee();
		objArticle.setId(8);
		objArticle.setName("Spring TEST8");
		empList.add(objArticle);
		HttpEntity<List<Employee>> requestEntity = new HttpEntity<List<Employee>>(empList, headers);
		restTemplate.put(url, requestEntity);
		// System.out.println(uri.getPath());
	}
	
	public void updateEmployeeListDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8095/employeesUpdate";
		List<Employee> empList = new ArrayList<Employee>();
		Employee objArticle = new Employee();
		objArticle.setId(6);
		objArticle.setName("Spring TEST666");
		empList.add(objArticle);
		
		objArticle = new Employee();
		objArticle.setId(7);
		objArticle.setName("Spring TEST777");
		empList.add(objArticle);
		
		objArticle = new Employee();
		objArticle.setId(8);
		objArticle.setName("Spring TEST888");
		empList.add(objArticle);
		HttpEntity<List<Employee>> requestEntity = new HttpEntity<List<Employee>>(empList, headers);
		restTemplate.postForLocation(url, requestEntity);
		// System.out.println(uri.getPath());
	}
	
	
	public void deleteEmployeeDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8095/employeeDelete/{id}";
		HttpEntity<Employee> requestEntity = new HttpEntity<Employee>(headers);
		restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, Employee.class, 6);
		// System.out.println(uri.getPath());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeRestClientUtil employeeRestClientUtil = new EmployeeRestClientUtil();

		// employeeRestClientUtil.addEmployeeDemo();
		//employeeRestClientUtil.updateEmployeeDemo();
		// employeeRestClientUtil.getEmployeeByIdDemo();
		// employeeRestClientUtil.deleteEmployeeDemo();
		//employeeRestClientUtil.addEmployeeListDemo();
		employeeRestClientUtil.updateEmployeeListDemo();
		employeeRestClientUtil.getAllEmployeesDemo();

	}

}
