package com.sts.web.service;

import java.util.List;

import com.sts.web.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmp();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}
