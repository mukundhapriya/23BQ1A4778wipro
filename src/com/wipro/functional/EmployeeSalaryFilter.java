package com.wipro.functional;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeSalaryFilter {

    public static void main(String[] args) {

        ArrayList<EmployeeSalary> list = new ArrayList<>();

        list.add(new EmployeeSalary(101,"Mukundha",8000));
        list.add(new EmployeeSalary(102,"Priya",12000));
        list.add(new EmployeeSalary(103,"Rahul",9000));
        list.add(new EmployeeSalary(104,"Anjali",15000));
        list.add(new EmployeeSalary(105,"Ravi",7000));

        Predicate<EmployeeSalary> p =
                e -> e.getSalary() < 10000;

        list.stream()
            .filter(p)
            .forEach(e -> System.out.println(e.getName()));
    }
}