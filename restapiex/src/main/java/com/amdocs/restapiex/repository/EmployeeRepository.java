package com.amdocs.restapiex.repository;

import java.util.List;

import com.amdocs.restapiex.model.Employee;

public interface EmployeeRepository {

	public String addEmployee(Employee employee); // to add new Employee
	public String updateEmployee(String empId, Employee employee); // update
	public Employee getEmployeeById(String id); // to get the specific employee details
	public List<Employee> getEmployees(); // to get all employee details.
}
