package com.cg.rest.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.pojo.Employee;

@RestController
public class Tester {
	
	@RequestMapping(value="/hello",method=RequestMethod.POST)
	public String sayHello(String name)
	{
		return "Hello "+name;
	}

	
	@RequestMapping(value="/viewEmp",method=RequestMethod.POST)
	public Employee viewAllEmployees(Employee emp)
	{
		return emp;
	}
}
