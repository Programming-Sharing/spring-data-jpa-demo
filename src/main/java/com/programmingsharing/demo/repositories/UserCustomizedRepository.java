package com.programmingsharing.demo.repositories;

import java.util.List;

import com.programmingsharing.demo.entities.Employee;

public interface UserCustomizedRepository {
	
	List<Employee> getUserWithCustomQuery();

}
