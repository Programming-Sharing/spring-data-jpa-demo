package com.programmingsharing.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.programmingsharing.demo.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>, EmployeeCustomizedRepository{
	
	List<Employee> findUserByLastName(String lastname);
	
	List<Employee> findUserByFistName(String firstname);

}