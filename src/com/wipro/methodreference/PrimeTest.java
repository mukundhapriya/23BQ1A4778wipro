package com.wipro.methodreference;

public class PrimeTest {

    public static void main(String[] args) {

        PrimeNumber pn = PrimeCheck::new;

        pn.create(17);
        pn.create(20);
    }
}