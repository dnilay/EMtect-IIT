package com.example.thymeleafdemoemployeelist.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.example.thymeleafdemoemployeelist.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	// load employee data
	
	private List<Employee> theEmployees;

	//accept Oriented programming
	@PostConstruct
	private void loadData() {
		
		// create employees
		Employee emp1 = new Employee(1, "Leslie", "Andrews", "leslie@luv2code.com");
		Employee emp2 = new Employee(2, "Emma", "Baumgarten", "emma@luv2code.com");
		Employee emp3 = new Employee(3, "Avani", "Gupta", "avani@luv2code.com");
		Employee emp4=new Employee(4,"John","Doe","john@email.com");

		// create the list
		theEmployees = new ArrayList<>();
		
		// add to the list
		theEmployees.add(emp1);
		theEmployees.add(emp2);
		theEmployees.add(emp3);
		theEmployees.add(emp4);
	
	}
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		// add to the spring model
		theModel.addAttribute("employees", theEmployees);
		
		return "list-employees";
	}
}









