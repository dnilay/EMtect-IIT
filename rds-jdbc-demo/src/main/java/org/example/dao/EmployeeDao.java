package org.example.dao;

import java.sql.SQLException;

import org.example.model.Employee;

public interface EmployeeDao {
	
	public Employee createEmployee(Employee employee)throws SQLException;

}
