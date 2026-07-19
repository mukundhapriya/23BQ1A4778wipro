package com.wipro.methodreference;

@FunctionalInterface
public interface PrimeNumber {

    PrimeCheck create(int n);
}