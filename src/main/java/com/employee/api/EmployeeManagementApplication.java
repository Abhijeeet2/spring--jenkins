package com.employee.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class EmployeeManagementApplication {

	@GetMapping("/welcome")
	public String getEmployees()
	{
		return "welcome to jenkins tutorial";
	}
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

}
