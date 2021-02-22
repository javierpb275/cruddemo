package com.javi.springboot.cruddemo.dao;

import java.util.List;

import com.javi.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();

}
