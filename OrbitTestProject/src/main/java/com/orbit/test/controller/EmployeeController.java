package com.orbit.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orbit.test.model.Employee;
import com.orbit.test.service.EmployeeServiceImpl;


@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl employeeServ;

	@PostMapping("/save")
	public String saveEmployee(@RequestBody Employee emp)
	{
		employeeServ.save(emp);
		
		return null;
		
	}
	
}
