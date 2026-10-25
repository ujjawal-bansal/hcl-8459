package org.abes.hrms.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmpRepoImplementation implements EmpRepo {
    public double squareroot(double d) {
        double result=Math.sqrt(d);
        return result;
    }

    public String empData() {
        return "";
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
