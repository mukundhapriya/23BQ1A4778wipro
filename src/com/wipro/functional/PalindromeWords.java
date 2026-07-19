package com.wipro.functional;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PalindromeWords {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("madam");
        list.add("java");
        list.add("level");
        list.add("radar");
        list.add("hello");
        list.add("refer");
        list.add("world");
        list.add("noon");
        list.add("spring");
        list.add("civic");

        Predicate<String> p =
                s -> s.equals(new StringBuilder(s).reverse().toString());

        list.stream()
            .filter(p)
            .forEach(System.out::println);
    }
}