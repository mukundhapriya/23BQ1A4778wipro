package com.wipro.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Mukundha",22,"Pune"));
        list.add(new Employee(102,"Priya",23,"Hyderabad"));
        list.add(new Employee(103,"Rahul",21,"Pune"));
        list.add(new Employee(104,"Anjali",22,"Delhi"));
        list.add(new Employee(105,"Ravi",24,"Pune"));

        List<Employee> result = list.stream()
                .filter(e -> e.getLocation().equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}