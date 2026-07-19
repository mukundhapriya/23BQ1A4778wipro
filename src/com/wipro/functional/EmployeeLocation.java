package com.wipro.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeLocation {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Mukundha","Hyderabad",50000));
        list.add(new Employee(102,"Priya","Pune",45000));
        list.add(new Employee(103,"Rahul","Delhi",40000));
        list.add(new Employee(104,"Anjali","Chennai",35000));
        list.add(new Employee(105,"Ravi","Bangalore",55000));

        Function<Employee,String> f = Employee::getLocation;

        List<String> locations =
                list.stream()
                    .map(f)
                    .collect(Collectors.toList());

        locations.forEach(System.out::println);
    }
}