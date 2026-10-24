package org.abesproject.hclhrms.repository;

import org.abesproject.hclhrms.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo {
    String addEmp(Employee emp);
    List<Employee> getEmp();
    Employee getEmpById(long empId);
    String deleteEmpById(long empId);
    String updateEmpById(long empId, String updatedEmail);
    String addEmpBulk(List<Employee> empsBulk);
    List<Employee> getEmpBulk();
}
