package com.wipro.streamapi;

import java.util.ArrayList;

public class StudentFilter {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1,"Mukundha",85));
        list.add(new Student(2,"Priya",35));
        list.add(new Student(3,"Rahul",76));
        list.add(new Student(4,"Anjali",45));
        list.add(new Student(5,"Ravi",91));

        long count = list.stream()
                .filter(s -> s.getMark() >= 50)
                .count();

        System.out.println("Students Passed : " + count);
    }
}