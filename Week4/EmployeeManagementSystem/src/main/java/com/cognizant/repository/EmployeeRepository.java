package com.cognizant.repository;

import com.cognizant.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// Exercise 3: Repository for Employee extending JpaRepository
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Exercise 5: Derived query method - find by name
    List<Employee> findByName(String name);

    // Exercise 5: Derived query method - find by email
    Employee findByEmail(String email);

    // Exercise 5: Custom @Query annotation
    @Query("SELECT e FROM Employee e WHERE e.department.name = :deptName")
    List<Employee> findByDepartmentName(String deptName);
}