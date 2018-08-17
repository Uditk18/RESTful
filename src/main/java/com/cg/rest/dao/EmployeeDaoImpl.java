package com.cg.rest.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.rest.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private Map<Integer, Employee> employeeDB = new HashMap<>();

	public void addNewEmployee(Employee employee) {
		employeeDB.put(employee.getEmpId(), employee);
	}

	public Collection<Employee> viewAllEmployees() {
		return employeeDB.values();
	}

	
}
