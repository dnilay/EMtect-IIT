package org.example.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionFactory {

	private static Connection connection;

	public static Connection getMyConnection()throws SQLException
	{
		connection=DriverManager.getConnection("<db url>","<user>","<password>");
		return connection;
	}

}
