package org.abesproject.hclhrms.repository;


import org.abesproject.hclhrms.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmpRepoImp implements EmployeeRepo {

    List<Employee> empList =  new ArrayList<>();


    @Override
    public String addEmp(Employee emp) {
        empList.add(emp);
        return "";
    }

    @Override
    public List<Employee> getEmp() {
        return empList;
    }

    @Override
    public Employee getEmpById(long empId) {
        return empList.stream().filter(e -> e.getEmpId() == empId).findFirst().orElse(null);
    }

    @Override
    public String addEmpBulk(List<Employee> empBulk) {

        empList.addAll(empBulk);
        return "Employees added successfully";
    }

    @Override
    public List<Employee> getEmpBulk() {
        return empList;
    }



    @Override
    public String deleteEmpById(long empId) {
        boolean status=false;
        if (getEmpById(empId) != null) {
            status= empList.removeIf(e -> e.getEmpId() == empId);
        }
        if (status) {
            return "Employee deleted successfully";
        }

        return "Employee not found with id  " + empId;
    }

    @Override
    public String updateEmpById(long empId, String updatedEmail) {
        Employee empExisting = getEmpById(empId);
        if ( empExisting != null) {
            empExisting.setEmail(updatedEmail);
        }
        return " Employee updated successfully";
    }
}
