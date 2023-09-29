package org.example;

import java.sql.SQLException;
import java.util.Scanner;

import org.example.dao.EmployeeDao;
import org.example.dao.EmployeeDaoImpl;
import org.example.model.Employee;

public class App 
{
	private static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args ) throws SQLException
    {

    	EmployeeDao employeeDao=new EmployeeDaoImpl();
    	int choice=0;
    	do {
    		System.out.println("1. Create Employee.");
    		System.out.println("0. Exit");
    		System.out.print("Enter Your Choice: ");
    		choice=scanner.nextInt();
    		switch (choice) {
			case 1:
				System.out.print("Enter first name: ");
				String fName=scanner.next();
				System.out.print("Enter last name: ");
				String lName=scanner.next();
				System.out.print("Enter email: ");
				String email=scanner.next();
				Employee employee=new Employee();
				employee.setFirstName(fName);
				employee.setLastName(lName);
				employee.setEmail(email);
				System.out.println("employee created: "+employeeDao.createEmployee(employee));
				break;
			case 0:
				System.out.println("bye...!!!");
				System.exit(0);
			default:
				System.out.println("invalid choice....");
				break;
			}
			
		} while (choice!=0);
    	
    	
    }
}
