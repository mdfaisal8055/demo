package com.demo.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
public class EmployeeRestController {
	private static Logger log = org.slf4j.LoggerFactory.getLogger(EmployeeRestController.class);

	@Autowired
	EmployeeService empService;

	@PostMapping("/api/v1/create")
	public @ResponseBody ResponseEntity<Employee> create(@RequestBody Employee emp) {
		log.info("Begin create method, EmployeeRestController");
		empService.createservice(emp);
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}

}
