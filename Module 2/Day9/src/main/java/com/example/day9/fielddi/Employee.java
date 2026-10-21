package com.example.day9.fielddi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Autowired
    private Address address;

    public void display() {
        System.out.println("Field injection address: " + address.getCity());
    }
}
