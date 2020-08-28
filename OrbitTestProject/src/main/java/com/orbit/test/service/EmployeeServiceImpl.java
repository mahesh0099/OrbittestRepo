package com.orbit.test.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.orbit.test.model.Employee;
import com.orbit.test.repository.EmployeeRepository;

public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public void save(Employee e)
	{
		repo.save(e);
	}
}
