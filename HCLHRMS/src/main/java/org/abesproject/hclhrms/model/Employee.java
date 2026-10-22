package org.abesproject.hclhrms.model;

// this will be converted into database
public class Employee {
    private long empId;
    private String empName;
    private String designation;
    private String progStack;
    private String email;

    public Employee(long empId, String empName, String designation, String progStack, String email) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.progStack = progStack;
        this.email = email;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getProgStack() {
        return progStack;
    }

    public void setProgStack(String progStack) {
        this.progStack = progStack;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


