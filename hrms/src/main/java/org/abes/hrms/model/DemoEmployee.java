package org.abes.hrms.model;

import org.abes.hrms.repository.EmpRepo;
import org.abes.hrms.repository.EmpRepoImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoEmployee {

    @Autowired
    private EmpRepoImplementation empRepo;

    public int getAdd(){
        return empRepo.add(20,40);
    }

    public double getSquareroot(){
        return empRepo.squareroot(200);
    }
}
