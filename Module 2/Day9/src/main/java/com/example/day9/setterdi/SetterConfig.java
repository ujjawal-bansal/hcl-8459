package com.example.day9.setterdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetterConfig {
    @Bean
    public Address address() {
        return new Address();
    }

    @Bean
    public Employee employee(Address address) {
        Employee employee = new Employee();
        employee.setAddress(address);
        return employee;
    }
}
