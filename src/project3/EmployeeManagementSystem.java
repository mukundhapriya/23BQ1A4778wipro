package project3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {

    static final String FILE_NAME = "employees.dat";

    @SuppressWarnings("unchecked")
    public static ArrayList<Employee> loadEmployees() {

        ArrayList<Employee> list = new ArrayList<>();

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream(FILE_NAME));

            list = (ArrayList<Employee>) ois.readObject();

            ois.close();

        } catch (Exception e) {

        }

        return list;
    }

    public static void saveEmployees(ArrayList<Employee> list) {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(FILE_NAME));

            oos.writeObject(list);

            oos.close();

        } catch (Exception e) {
            System.out.println("Error Saving File");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> employeeList = loadEmployees();

        int choice;

        do {

            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();

                    employeeList.add(new Employee(id, name, age, salary));

                    saveEmployees(employeeList);

                    System.out.println("Employee Added Successfully.");

                    break;

                case 2:

                    System.out.println("-----Report-----");

                    for (Employee emp : employeeList) {
                        System.out.println(emp);
                    }

                    System.out.println("-----End of Report-----");

                    break;

                case 3:

                    System.out.println("Exiting the System");

                    break;

                default:

                    System.out.println("Invalid Choice");

            }

        } while (choice != 3);

        sc.close();
    }
}