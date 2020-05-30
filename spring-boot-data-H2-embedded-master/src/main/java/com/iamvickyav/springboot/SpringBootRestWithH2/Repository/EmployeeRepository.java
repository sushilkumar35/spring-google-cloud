package com.iamvickyav.springboot.SpringBootRestWithH2.Repository;

import com.iamvickyav.springboot.SpringBootRestWithH2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
}
