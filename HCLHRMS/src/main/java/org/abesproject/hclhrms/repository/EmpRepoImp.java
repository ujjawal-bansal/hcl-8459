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
        return "";
    }

    @Override
    public Employee updateEmpById(long empId, Employee updatedEmp) {
        return null;
    }
}
