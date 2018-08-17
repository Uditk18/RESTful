package com.cg.rest.service;

import java.util.Collection;

import com.cg.rest.pojo.Employee;

public interface EmployeeService {

	void addNewEmployee(Employee employee);

	Collection<Employee> viewAllEmployees();


}