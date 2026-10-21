package com.example.hrms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = context.getBean(Employee.class);
        Employee sameEmployee = context.getBean(Employee.class);
        SalaryCalculator calculator = context.getBean(SalaryCalculator.class);

        System.out.println("Same Spring bean: " + (employee == sameEmployee));
        System.out.println("Department: " + employee.getDepartment().getName());
        System.out.println("Address: " + employee.getAddress().getCity());
        System.out.println("Salary: " + calculator.calculateSalary());
        context.close();
    }
}
