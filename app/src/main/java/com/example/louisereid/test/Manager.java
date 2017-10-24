package com.example.louisereid.test;

/**
 * Created by louisereid on 24/10/2017.
 */

public class Manager extends Employee {
    private String deptName;


    public Manager(int id, String name, String ssn, double salary, String deptname) {
            super(id, name, ssn, salary);
        this.deptName = deptname;
    }

    public String getDeptName() {
        return deptName;
    }


}


