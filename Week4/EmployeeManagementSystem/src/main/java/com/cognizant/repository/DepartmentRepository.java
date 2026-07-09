package com.cognizant.repository;

import com.cognizant.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Exercise 3: Repository for Department extending JpaRepository
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Exercise 5: Derived query method - find by name
    Department findByName(String name);
}