package com.hcc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcc.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}