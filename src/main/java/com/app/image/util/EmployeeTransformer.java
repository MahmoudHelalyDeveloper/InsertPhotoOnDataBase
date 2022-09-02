package com.app.image.util;

import java.sql.SQLException;

import com.app.image.entity.Employees;
import com.app.image.model.EmployeeRequest;

public class EmployeeTransformer {

	
	public static Employees toEmployeesEntity(EmployeeRequest request) {
		
		Employees employees = new Employees();
		employees.setId(request.getId());
		employees.setFirstName(request.getFirstName());
		employees.setLastName(request.getLastName());
		employees.setBirthDate(request.getBirthDate());
		try {
			employees.setPhoto(ImageUtil.convertToBytes(request.getPhoto()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
		return employees;
	}
	
}
