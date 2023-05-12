package com.hcc.dataseed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hcc.entities.Employee;
import com.hcc.repositories.EmployeeRepository;


@Component
public class EmployeeDataLoader implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		loadEmployeeData();
	}

	private void loadEmployeeData() {
		if (employeeRepository.count() == 0) {
			Employee employee1 = new Employee("John", "Doe", "john_doe@gmail.com");
			Employee employee2 = new Employee("John", "Cook", "john_cook@hotmail.com");
			employeeRepository.save(employee1);
			employeeRepository.save(employee2);
		}
		System.out.println(employeeRepository.count());
	}
}