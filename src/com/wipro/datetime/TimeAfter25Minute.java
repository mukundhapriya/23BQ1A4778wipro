package com.wipro.datetime;

import java.time.LocalTime;

public class TimeAfter25Minute {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();

        System.out.println("Current Time : " + now);
        System.out.println("After 25 Minutes : " + now.plusMinutes(25));
    }
}