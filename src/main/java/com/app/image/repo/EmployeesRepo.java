package com.app.image.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.image.entity.Employees;

@Repository
public interface EmployeesRepo  extends JpaRepository<Employees, Integer> {

}
