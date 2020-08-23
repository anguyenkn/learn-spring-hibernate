package com.aidan.springboot.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aidan.springboot.crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// that's it... no need to write any code :)
}
