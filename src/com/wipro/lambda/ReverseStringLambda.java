package com.wipro.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseStringLambda {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Java");
        al.add("Python");
        al.add("HTML");
        al.add("Oracle");
        al.add("Spring");
        al.add("React");
        al.add("Angular");
        al.add("CSS");
        al.add("Servlet");
        al.add("JSP");

        Collections.sort(al, (a, b) -> b.compareTo(a));

        al.forEach(System.out::println);
    }
}