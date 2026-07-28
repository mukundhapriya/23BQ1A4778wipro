package com.wipro.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Apple");
        ts.add("Orange");
        ts.add("Banana");
        ts.add("Mango");

        System.out.println("Ascending Order");
        System.out.println(ts);

        System.out.println("Reverse Order");
        System.out.println(ts.descendingSet());

        System.out.println("Iterator");

        Iterator<String> itr = ts.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Contains Mango : " + ts.contains("Mango"));
        System.out.println("Contains Grapes : " + ts.contains("Grapes"));
    }
}