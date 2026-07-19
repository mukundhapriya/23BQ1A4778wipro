package com.wipro.project9;

import java.util.ArrayList;
import java.util.Scanner;

public class StringOperationsTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1 : ");
        String s1 = sc.next();

        System.out.print("Enter String 2 : ");
        String s2 = sc.next();

        StringOperations obj = new StringOperations();

        ArrayList<String> output = obj.performOperations(s1, s2);

        System.out.println("\nOutput:");

        for (String str : output) {
            System.out.println(str);
        }

        sc.close();
    }
}