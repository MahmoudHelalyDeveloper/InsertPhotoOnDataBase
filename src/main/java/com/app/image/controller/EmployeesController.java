package com.app.image.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.image.entity.Employees;
import com.app.image.model.EmployeeRequest;
import com.app.image.service.EmployeesService;

import net.bytebuddy.asm.Advice.This;

@RestController
@RequestMapping("employees")
public class EmployeesController {

	@Autowired
	private EmployeesService employeesService;
	
	@RequestMapping("/getAllEmployees")
	public ResponseEntity<Employees> findALL(){
		
		List<Employees> findAllEmployees = this.employeesService.findAllEmployees();
	
	
	return new ResponseEntity(findAllEmployees,HttpStatus.OK);
	}
	
	
	@PostMapping("/addNewEmployee")
	public ResponseEntity<Employees> addNewEmployee( @RequestBody EmployeeRequest employees){
		
		Employees addNewEmployees = this.employeesService.addNewEmployees(employees);
		
		
		return new ResponseEntity(addNewEmployees,HttpStatus.OK);
	}
	
	
}
