package com.wipro.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ReverseWordsConsumer {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Oracle");
        list.add("Spring");
        list.add("React");
        list.add("Servlet");
        list.add("JSP");
        list.add("HTML");
        list.add("CSS");
        list.add("Angular");

        Consumer<List<String>> consumer = l -> {

            for (int i = 0; i < l.size(); i++) {

                String rev = new StringBuilder(l.get(i))
                        .reverse()
                        .toString();

                l.set(i, rev);
            }
        };

        consumer.accept(list);

        list.forEach(System.out::println);
    }
}