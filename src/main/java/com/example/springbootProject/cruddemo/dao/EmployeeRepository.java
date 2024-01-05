package com.example.springbootProject.cruddemo.dao;

import com.example.springbootProject.cruddemo.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.Path;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="employees")
public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

}
