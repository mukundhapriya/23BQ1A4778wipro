package com.wipro.functional;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PerfectSquareFilter {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(9);
        list.add(16);
        list.add(25);
        list.add(30);
        list.add(36);

        Predicate<Integer> p = n -> {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        };

        list.stream()
            .filter(p)
            .forEach(System.out::println);
    }
}