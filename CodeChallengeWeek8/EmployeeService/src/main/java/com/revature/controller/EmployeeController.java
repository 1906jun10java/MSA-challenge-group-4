package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Employee;
import com.revature.service.EmployeeService;

@CrossOrigin
@RestController
//@RequestMapping(value="/employee")
public class EmployeeController {

	private EmployeeService employeeService;
	
	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping(value="/all", consumes = {"application/json"})
   
	public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
	
}
