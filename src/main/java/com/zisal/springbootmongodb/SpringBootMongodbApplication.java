package com.zisal.springbootmongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringBootMongodbApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongodbApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		employeeRepository.deleteAll();

		Employee boss = new Employee();
		boss.setCode("Boss");
		boss.setName("Boss");
		employeeRepository.save(boss);

		Employee employee1 = new Employee();
		employee1.setCode("Employee 1");
		employee1.setName("Employee One");
		employeeRepository.save(employee1);

		Employee employee2 = new Employee();
		employee2.setCode("Employee 2");
		employee2.setName("Employee Two");
		employee2.setEmployeeParentId(boss.getId());
		employeeRepository.save(employee2);

		Employee employee3 = new Employee();
		employee3.setCode("Employee 3");
		employee3.setName("Employee Three");
		employee3.setEmployeeParentId(boss.getId());
		employeeRepository.save(employee3);

		List<Employee> employeeList = employeeRepository.findAll();
		for (Employee data : employeeList) {
			System.out.println(data.toString());
		}
	}
}
