package org.abes.hrms.controller;

import org.abes.hrms.model.DemoEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private DemoEmployee demoEmployee;

    @GetMapping("/")
    public String welcome(){
        return "<h2 style='color:red'>  Welcome to HRMS Application!</h2>";
    }

    @GetMapping("/add")
    public int sum(){
        System.out.println("inside controller point /add");
        int result= demoEmployee.getAdd();
        return result;
    }

    @GetMapping("/SqRoot")
    public double getSqRoot(){
        return demoEmployee.getSquareroot();
    }
}
