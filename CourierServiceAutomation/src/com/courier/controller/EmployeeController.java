package com.courier.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.courier.dto.Employee;
import com.courier.service.EmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeController {

	EmployeeService employeeService = new EmployeeService();

	@RequestMapping(value = "/insert/{empid}/{name}/{age}/{address}/{mobile}/{email}", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addEmployee(@PathVariable int empid, @PathVariable String name,
			@PathVariable int age, @PathVariable String address,
			@PathVariable long mobile, @PathVariable String email) {
		Employee employee = new Employee();
		employee.setEmpid(empid);
		employee.setName(name);
		employee.setAge(age);
		employee.setAddress(address);
		employee.setMobile(mobile);
		employee.setEmail(email);
		employeeService.addEmployee(employee);
		System.out.println("New Employee added.");

	}
}
