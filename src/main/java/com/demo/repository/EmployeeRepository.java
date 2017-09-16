package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.model.Employee;


public interface EmployeeRepository extends MongoRepository<Employee , String> {
	
	//public void createRecord(Employee emp);

}
