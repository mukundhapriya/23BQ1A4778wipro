package com.wipro.datetime;

import java.time.LocalDate;

public class LeapYearCheck {

    public static void main(String[] args) {

        int year = LocalDate.now().getYear();

        if (LocalDate.now().isLeapYear())
            System.out.println(year + " is Leap Year");
        else
            System.out.println(year + " is Not Leap Year");
    }
}