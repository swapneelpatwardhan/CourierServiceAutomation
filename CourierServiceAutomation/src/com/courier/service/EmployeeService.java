package com.courier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courier.dao.EmployeeDao;
import com.courier.dto.Employee;

@Service
public class EmployeeService {
	private EmployeeDao employeeDao;
	
	@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	//Adding a new employee
	public void addEmployee(Employee employee){
		employeeDao.addEmployee(employee);
	}
}
