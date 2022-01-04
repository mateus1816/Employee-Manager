package com.mateus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
