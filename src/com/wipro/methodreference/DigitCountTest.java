package com.wipro.methodreference;

public class DigitCountTest {

    public static void main(String[] args) {

        DigitCount dc = DigitUtil::digitCount;

        System.out.println("Digits = " + dc.count(987654));
    }
}