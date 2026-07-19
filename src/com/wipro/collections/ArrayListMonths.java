package com.wipro.collections;

import java.util.ArrayList;

public class ArrayListMonths {

    public static void main(String[] args) {

        ArrayList<String> months = new ArrayList<>();

        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        for(String month : months) {
            System.out.println(month);
        }
    }
}