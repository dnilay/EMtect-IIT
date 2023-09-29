package org.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.example.factory.MyConnectionFactory;
import org.example.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private Connection connection = null;
	{
		try {
			connection = MyConnectionFactory.getMyConnection();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public Employee createEmployee(Employee employee) throws SQLException {
		PreparedStatement preparedStatement = connection
				.prepareStatement("insert into employees(first_name,last_name,email) values(?,?,?)");
		preparedStatement.setString(1, employee.getFirstName());
		preparedStatement.setString(2, employee.getLastName());
		preparedStatement.setString(3, employee.getEmail());
		preparedStatement.executeUpdate();
		return employee;
	}

}
