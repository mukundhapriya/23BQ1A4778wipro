package com.wipro.project5;

import java.util.Scanner;

public class StringListMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringList obj = new StringList();

        int choice;

        do {

            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:
                System.out.print("Enter the item to be inserted: ");
                obj.insert(sc.nextLine());
                break;

            case 2:
                System.out.print("Enter the item to search: ");
                obj.search(sc.nextLine());
                break;

            case 3:
                System.out.print("Enter the item to delete: ");
                obj.delete(sc.nextLine());
                break;

            case 4:
                obj.display();
                break;

            case 5:
                System.out.println("Thank You");
                break;

            default:
                System.out.println("Invalid Choice");
            }

            System.out.println();

        } while (choice != 5);

        sc.close();
    }
}