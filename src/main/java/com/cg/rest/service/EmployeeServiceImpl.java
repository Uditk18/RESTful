package com.cg.rest.service;

import java.util.Collection;

import com.cg.rest.dao.EmployeeDao;
import com.cg.rest.dao.EmployeeDaoImpl;
import com.cg.rest.pojo.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao = new EmployeeDaoImpl();

	@Override
	public void addNewEmployee(Employee employee) {
		dao.addNewEmployee(employee);
	}

	@Override
	public Collection<Employee> viewAllEmployees() {
		return dao.viewAllEmployees();
	}


}
