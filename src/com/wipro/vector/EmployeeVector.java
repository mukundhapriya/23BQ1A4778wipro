package com.wipro.vector;

import java.util.Vector;

public class EmployeeVector {

    Vector<Employee> employees = new Vector<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public Vector<Employee> getEmployees() {
        return employees;
    }
}