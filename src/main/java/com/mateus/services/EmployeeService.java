package com.mateus.services;

import java.util.List;
import java.util.UUID;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateus.model.Employee;
import com.mateus.repositories.EmployeeRepo;

@Service
public class EmployeeService {
	private final EmployeeRepo employeeRepo;
	
	@Autowired
	public EmployeeService(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	
	public Employee addEmployee(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeeRepo.save(employee);
	}
	
	public List<Employee> findAllEmployee(){
		return employeeRepo.findAll();
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public Employee findEmployeeById(Long id){
		return employeeRepo.findEmployeeById(id).orElseThrow(() -> 
		new UserNotFoundException("Objeto não encontrado! Id: " + id));
	}
	
	public void deleteEmployee(Long id) {
		employeeRepo.deleteById(id);
	}
}
