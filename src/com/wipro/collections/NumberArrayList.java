package com.wipro.collections;

import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(25.5);
        numbers.add(100L);
        numbers.add(5.75f);
        numbers.add(200);

        System.out.println("Numbers:");

        for(Number n : numbers) {
            System.out.println(n);
        }
    }
}