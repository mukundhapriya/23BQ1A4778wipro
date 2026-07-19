package com.wipro.lambda;

import java.util.ArrayList;

public class PrimeLambda {

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 1; i <= 25; i++) {
            al.add((int) (Math.random() * 100));
        }

        System.out.println("Prime Numbers:");

        al.stream()
          .filter(PrimeLambda::isPrime)
          .forEach(System.out::println);
    }
}