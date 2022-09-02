package com.app.image.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.image.entity.Employees;
import com.app.image.model.EmployeeRequest;
import com.app.image.repo.EmployeesRepo;
import com.app.image.util.EmployeeTransformer;
import com.app.image.util.ImageUtil;

@Service
public class EmployeesServiceImpl extends EmployeesService {
	
	@Autowired
	private EmployeesRepo employeesRepo;
		
	@Override
	public Employees addNewEmployees(EmployeeRequest employees) {
		// TODO Auto-generated method stub
		
		
		Employees employeesEntity = EmployeeTransformer.toEmployeesEntity(employees);
		
		
		Employees newEmployees = this.employeesRepo.save(employeesEntity);

		return newEmployees;
	}
	
	@Override
	public List<Employees> findAllEmployees() {
		// TODO Auto-generated method stub
		
		List<Employees> findAll = this.employeesRepo.findAll();
		return findAll;
	}
	
	
}
