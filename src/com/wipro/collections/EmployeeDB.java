package com.wipro.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {

    ArrayList<Employee> list = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {

        Iterator<Employee> itr = list.iterator();

        while (itr.hasNext()) {
            Employee e = itr.next();

            if (e.getEmpId() == empId) {
                itr.remove();
                return true;
            }
        }

        return false;
    }

    public String showPaySlip(int empId) {

        for (Employee e : list) {
            if (e.getEmpId() == empId) {
                return "Pay Slip of " + e.getEmpName() +
                        "\nSalary : " + e.getSalary();
            }
        }

        return "Employee Not Found";
    }

    public void showAllEmployees() {

        for (Employee e : list) {
            e.getEmployeeDetails();
            System.out.println("----------------------");
        }
    }
}