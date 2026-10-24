package com.abes.hrmsdatabase.service;

import com.abes.hrmsdatabase.model.Employee;
import com.abes.hrmsdatabase.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;


    public String createEmployee() {
        Employee emp1 = new Employee(2001, "ram", "JAVA", "Developer");
        employeeRepo.save(emp1);
        return "Employee created successfully";
    }

    public String updateEmployee() {
        return employeeRepo.findById(2001L)
                .map(employee -> {
                    employee.setStack("Spring Boot");
                    employee.setDescription("Backend Developer");
                    employeeRepo.save(employee);
                    return "Employee updated successfully";
                })
                .orElse("Employee not found");
    }

    public String deleteEmployee() {
        if (!employeeRepo.existsById(2001L)) {
            return "Employee not found";
        }

        employeeRepo.deleteById(2001L);
        return "Employee deleted successfully";
    }


}
