package com.wipro.vector;

import java.util.Enumeration;
import java.util.Iterator;

public class EmployeeVectorTest {

    public static void main(String[] args) {

        EmployeeVector ev = new EmployeeVector();

        ev.addEmployee(new Employee(101, "Mukundha", 50000));
        ev.addEmployee(new Employee(102, "Priya", 45000));
        ev.addEmployee(new Employee(103, "Rahul", 40000));

        System.out.println("===== Using Iterator =====");

        Iterator<Employee> itr = ev.getEmployees().iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            System.out.println("-----------------------");
        }

        System.out.println();

        System.out.println("===== Using Enumeration =====");

        Enumeration<Employee> en = ev.getEmployees().elements();

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
            System.out.println("-----------------------");
        }
    }
}