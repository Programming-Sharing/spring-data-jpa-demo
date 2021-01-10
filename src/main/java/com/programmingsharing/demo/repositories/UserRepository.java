package com.programmingsharing.demo.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.programmingsharing.demo.entities.Employee;

@Repository
public interface UserRepository extends JpaRepository<Employee, Integer>, UserCustomizedRepository{
	
	List<Employee> findUserByLastName(String lastname, Sort sort);
	
	Page<Employee> findUserByLastName(String lastname, Pageable pagingInfo);

}