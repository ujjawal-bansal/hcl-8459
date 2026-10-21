package com.example.hrms;

public class SalaryCalculator {
    private final Employee employee;

    public SalaryCalculator(Employee employee) {
        this.employee = employee;
    }

    public double calculateSalary() {
        return employee.getBasePay();
    }
}
