package com.amdocs.restapiex.service;

import java.util.List;



import com.amdocs.restapiex.model.Employee;
import com.amdocs.restapiex.repository.EmployeeRepository;
import com.amdocs.restapiex.repository.EmployeeRepositoryImpl;


public class EmployeeServiceImpl implements EmployeeService {

	
	EmployeeRepository employeeRepository =new EmployeeRepositoryImpl();
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.addEmployee(employee);
	}

	public String updateEmployee(String empId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
