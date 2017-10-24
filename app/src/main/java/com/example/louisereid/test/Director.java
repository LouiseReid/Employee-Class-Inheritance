package com.example.louisereid.test;

/**
 * Created by louisereid on 24/10/2017.
 */

public class Director extends Manager {
    private double budget;

    public Director(int id, String name, String ssn, double salary, String deptname, double budget) {
        super(id, name, ssn, salary, deptname);
        this.budget = budget;

    }

    public double getBudget() {
        return budget;
    }
}
