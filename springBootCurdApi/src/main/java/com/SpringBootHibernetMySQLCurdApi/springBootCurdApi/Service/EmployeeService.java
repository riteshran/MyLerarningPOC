package com.SpringBootHibernetMySQLCurdApi.springBootCurdApi.Service;

import java.util.List;

import com.SpringBootHibernetMySQLCurdApi.springBootCurdApi.Model.Employee;

public interface EmployeeService {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
	
	/* void update(Employee employee); */


}
