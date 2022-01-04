package com.mateus.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

	Optional findEmployeeById(Long id);
}
