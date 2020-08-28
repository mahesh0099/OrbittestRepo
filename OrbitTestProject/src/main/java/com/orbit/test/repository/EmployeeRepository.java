package com.orbit.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orbit.test.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	void saveEmployee(Employee emp);
	List<Employee> getAll();
}
