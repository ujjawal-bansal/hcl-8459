package com.example.hrms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Address address() {
        return new Address("Ghaziabad");
    }

    @Bean
    public Department department() {
        return new Department("Engineering");
    }

    @Bean
    public Employee employee(Address address, Department department) {
        return new Employee(50000, address, department);
    }

    @Bean
    public SalaryCalculator salaryCalculator(Employee employee) {
        return new SalaryCalculator(employee);
    }
}
