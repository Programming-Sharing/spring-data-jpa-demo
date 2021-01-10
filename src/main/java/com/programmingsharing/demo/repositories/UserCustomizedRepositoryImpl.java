package com.programmingsharing.demo.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.programmingsharing.demo.entities.Employee;

public class UserCustomizedRepositoryImpl implements UserCustomizedRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Employee> getUserWithCustomQuery() {
		System.out.println("UserCustomizedRepositoryImpl --> implement");
		List<Employee> userList = entityManager.createQuery("Select e from Employee e").getResultList();
		
		// Do the necessary tasks
		
		return userList;
	}

}
