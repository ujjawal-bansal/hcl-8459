package com.example.day9.setterdi;

public class Employee {
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display() {
        System.out.println("Setter injection address: " + address.getCity());
    }
}
