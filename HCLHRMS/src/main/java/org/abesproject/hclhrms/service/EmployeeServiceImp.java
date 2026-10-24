package org.abesproject.hclhrms.service;


import org.abesproject.hclhrms.model.Employee;
import org.abesproject.hclhrms.repository.EmpRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// this is the service
@Service
public class EmployeeServiceImp {
    @Autowired
    private EmpRepoImp empRepo;
    public String addEmp()
    {
        Employee emp1 = new Employee(200, "Ujjawal", "FSD", "JAVA", "ujjawabansal656@gmail.com");
        return empRepo.addEmp(emp1);
    }

    public List<Employee> getAllEmp(){
        return empRepo.getEmp();
    }

    public Employee getEmpById()
    {
        return empRepo.getEmpById(200);
    }

    public String addEmpBulk(){
        List <Employee> emplist=List.of(new Employee(201, "sam", "SDE", "PYTHON", "sam@gmail.com"),
                new Employee(202, "ram", "SDE", "RUST", "ram@gmail.com"),
                new Employee(203, "sita", "MANAGER", "GOLANG", "sita@gmail.com")
        );
        return empRepo.addEmpBulk(emplist);
    }

    public String deleteEmpById()
    {
        return empRepo.deleteEmpById(200);
    }

    public String updateEmpById() {
        return empRepo.updateEmpById(202, "abcd@gmail.com");

    }



}
