package com.wipro.methodreference;

public class FactorialTest {

    public static void main(String[] args) {

        FactorialClass obj = new FactorialClass();

        Factorial f = obj::factorial;

        System.out.println("Factorial = " + f.factorial(5));
    }
}