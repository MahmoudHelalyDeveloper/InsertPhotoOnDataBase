package com.app.image.service;

import java.util.List;

import com.app.image.entity.Employees;
import com.app.image.model.EmployeeRequest;

public abstract class EmployeesService {

	public abstract List<Employees> findAllEmployees();
	
	public abstract Employees addNewEmployees(EmployeeRequest employees);
	
}
