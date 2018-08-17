package com.cg.rest.dao;

import java.util.Collection;

import com.cg.rest.pojo.Employee;

public interface EmployeeDao {

	void addNewEmployee(Employee employee);

	Collection<Employee> viewAllEmployees();

}