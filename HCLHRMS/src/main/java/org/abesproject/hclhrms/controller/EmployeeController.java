package org.abesproject.hclhrms.controller;

import org.abesproject.hclhrms.service.EmployeeServiceImp;
import org.abesproject.hclhrms.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeServiceImp empServiceImp;

    @GetMapping("/")
    public String welcomeMsg(){
        return "Welcome to HCLHRMS";
    }

    @GetMapping("/addemp")
    public String addNewEmp(){
        empServiceImp.addEmp();
        return "Employee added successfully";
    }

    @GetMapping("/getemp")
    public List<Employee> getEmp(){
        return empServiceImp.getAllEmp();

    }

    @GetMapping("/getempbyid")
    public Employee getEmpById(){
        return empServiceImp.getEmpById();
    }

    @GetMapping("/addbulkemps")
        public String addBulkEmps(){
            return empServiceImp.addEmpBulk();

    }
}
