package com.wipro.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ExperienceCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Joining Date (yyyy-mm-dd): ");
        LocalDate joiningDate = LocalDate.parse(sc.next());

        LocalDate today = LocalDate.now();

        Period p = Period.between(joiningDate, today);

        System.out.println("Experience");
        System.out.println("Years  : " + p.getYears());
        System.out.println("Months : " + p.getMonths());
        System.out.println("Days   : " + p.getDays());

        sc.close();
    }
}