package com.example.louisereid.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by louisereid on 24/10/2017.
 */

public class EmployeeTest {
    Employee employee;
    Manager manager;
    Engineer engineer;
    Admin admin;
    Director director;

    @Before
    public void before() {
        employee = new Employee(5, "Louise", "1234", 100.00);
        manager = new Manager(2, "Alanna", "12345", 150.00, "Finance");
        engineer = new Engineer(7, "Dave", "8934", 100.00);
        admin = new Admin(3, "John", "4676", 100.00);
        director = new Director(1, "Sally", "1256", 200.00, "Finance", 5000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Louise", employee.getName());
        assertEquals("Alanna", manager.getName());
        assertEquals("Dave", engineer.getName());
        assertEquals("John", admin.getName());
        assertEquals("Sally", director.getName());

    }

    @Test
    public void setName() {
        employee.setName("Jo");
        manager.setName("Claire");
        assertEquals("Jo", employee.getName());
        assertEquals("Claire", manager.getName());
    }

    @Test
    public void hasssn(){
        assertEquals("1234", employee.getSocialSecurityNumber());
        assertEquals("12345", manager.getSocialSecurityNumber());
        assertEquals("8934", engineer.getSocialSecurityNumber());
        assertEquals("4676", admin.getSocialSecurityNumber());
        assertEquals("1256", director.getSocialSecurityNumber());

    }

    @Test
    public void hasId(){
        assertEquals(5, employee.getId());
        assertEquals(2, manager.getId());
        assertEquals(7, engineer.getId());
        assertEquals(3, admin.getId());
        assertEquals(1, director.getId());
    }

    @Test
    public void hasSalary(){
        assertEquals(100.00, employee.getSalary(), 0.1);
        assertEquals(150.00, manager.getSalary(), 0.1);
        assertEquals(100.00, engineer.getSalary(), 0.1);
        assertEquals(100.00, admin.getSalary(), 0.1);
        assertEquals(200.00, director.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        employee.raiseSalary();
        manager.raiseSalary();
        assertEquals(200.00, employee.getSalary(), 0.1);
        assertEquals(300.00, manager.getSalary(), 0.1);
    }

    @Test
    public void deptName(){
        assertEquals("Finance", manager.getDeptName());
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void getBudget(){
        assertEquals(5000.00, director.getBudget(), 0.1);
    }

}
