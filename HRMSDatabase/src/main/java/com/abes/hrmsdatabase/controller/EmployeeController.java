package com.abes.hrmsdatabase.controller;

import com.abes.hrmsdatabase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService ;

    @GetMapping("/")
    public String msg(){
        return "Welcome to SpringBoot App Development";
    }

    @GetMapping("/addemp")
    public String addEmp(){
        return employeeService.createEmployee();
    }

    @PutMapping("/updateemp")
    public String updateEmp() {
        return employeeService.updateEmployee();
    }

    @DeleteMapping("/deleteemp")
    public String deleteEmp() {
        return employeeService.deleteEmployee();
    }
}
