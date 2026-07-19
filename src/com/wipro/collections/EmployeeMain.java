package com.wipro.collections;

public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        db.addEmployee(new Employee(101, "Mukundha",
                "mukundha@gmail.com", "Female", 50000));

        db.addEmployee(new Employee(102, "Priya",
                "priya@gmail.com", "Female", 45000));

        db.addEmployee(new Employee(103, "Rahul",
                "rahul@gmail.com", "Male", 40000));

        System.out.println("Employee Details");
        System.out.println();

        db.showAllEmployees();

        System.out.println(db.showPaySlip(102));

        db.deleteEmployee(103);

        System.out.println();
        System.out.println("After Deletion");
        System.out.println();

        db.showAllEmployees();
    }
}