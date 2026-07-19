package com.wipro.lambda;

import java.util.ArrayList;

public class OddLengthLambda {

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

        al.stream()
          .filter(s -> s.length() % 2 != 0)
          .forEach(System.out::println);
    }
}