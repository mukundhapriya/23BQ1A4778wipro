package com.wipro.project4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> list = new ArrayList<>();

        System.out.println("Enter the Number of Employees");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter Employee " + i + " Details");

            System.out.println("Enter the First Name");
            String first = sc.nextLine();

            System.out.println("Enter the Last Name");
            String last = sc.nextLine();

            System.out.println("Enter the Mobile Number");
            String mobile = sc.nextLine();

            System.out.println("Enter the Email");
            String email = sc.nextLine();

            System.out.println("Enter the Address");
            String address = sc.nextLine();

            list.add(new Employee(first, last, mobile, email, address));
        }

        Collections.sort(list, new EmployeeComparator());

        System.out.println();
        System.out.println("Employee List");
        System.out.printf("%-15s %-15s %-15s %-30s %-20s%n",
                "FirstName",
                "LastName",
                "Mobile",
                "Email",
                "Address");

        for (Employee e : list) {

            System.out.printf("%-15s %-15s %-15s %-30s %-20s%n",
                    e.getFirstName(),
                    e.getLastName(),
                    e.getMobileNumber(),
                    e.getEmail(),
                    e.getAddress());
        }

        sc.close();
    }
}