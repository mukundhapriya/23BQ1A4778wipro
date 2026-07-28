package com.wipro.functional;

import java.util.ArrayList;
import java.util.function.Consumer;

public class OddEvenConsumer {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        Consumer<Integer> consumer = n -> {

            if (n % 2 == 0)
                System.out.println(n + " Even");
            else
                System.out.println(n + " Odd");
        };

        list.forEach(consumer);
    }
}