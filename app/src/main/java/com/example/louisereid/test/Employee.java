package com.example.louisereid.test;

/**
 * Created by louisereid on 24/10/2017.
 */

public class Employee {
    private int id;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int id, String name, String ssn, double salary) {
        this.id = id;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null)
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }


    public String getSocialSecurityNumber() {
        return ssn;
    }

    public double raiseSalary() {
        return salary *= 2 < 0 ? 0 : 2;
//        if multiple is less than 0 multiply by 0 otherwise multiply by 2

    }
}
