package com.wipro.project8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoxMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Box> set = new HashSet<>();

        System.out.print("Enter the number of Box: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter the Box " + i + " details");

            System.out.print("Enter Length: ");
            double length = sc.nextDouble();

            System.out.print("Enter Width: ");
            double width = sc.nextDouble();

            System.out.print("Enter Height: ");
            double height = sc.nextDouble();

            Box b = new Box(length, width, height);

            if (set.add(b))
                System.out.println("Box Added Successfully");
            else
                System.out.println("Box with same volume already exists");
        }

        System.out.println("\nBoxes in Set:");

        for (Box b : set) {
            System.out.println(b);
        }

        sc.close();
    }
}