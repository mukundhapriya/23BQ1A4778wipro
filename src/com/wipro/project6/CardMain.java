package com.wipro.project6;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashSet;

public class CardMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Character> symbols = new HashSet<>();
        Map<Character, Card> map = new TreeMap<>();

        int count = 0;

        while (symbols.size() < 4) {

            System.out.println("Enter a card :");

            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();

            count++;

            if (!symbols.contains(symbol)) {

                symbols.add(symbol);
                map.put(symbol, new Card(symbol, number));
            }
        }

        System.out.println("Four symbols gathered in " + count + " cards.");

        System.out.println("Cards in Set are :");

        for (Card c : map.values()) {

            System.out.println(c.getSymbol() + " " + c.getNumber());
        }

        sc.close();
    }
}