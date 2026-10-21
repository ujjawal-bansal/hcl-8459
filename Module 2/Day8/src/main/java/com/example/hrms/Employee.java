package com.example.hrms;

public class Employee {
    private final double basePay;
    private final Address address;
    private final Department department;

    public Employee(double basePay, Address address, Department department) {
        this.basePay = basePay;
        this.address = address;
        this.department = department;
    }

    public double getBasePay() {
        return basePay;
    }

    public Address getAddress() {
        return address;
    }

    public Department getDepartment() {
        return department;
    }
}
