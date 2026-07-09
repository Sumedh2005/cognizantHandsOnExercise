package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Exercise 1: Main Spring Boot Application
@SpringBootApplication
public class EmployeeManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementApplication.class, args);
        System.out.println("Employee Management System started successfully!");
        System.out.println("H2 Console: http://localhost:8080/h2-console");
        System.out.println("Employees API: http://localhost:8080/employees");
        System.out.println("Departments API: http://localhost:8080/departments");
    }
}