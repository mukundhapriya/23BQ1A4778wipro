package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student("Ravi", new int[] {80, 70, 90});
        students[1] = new Student(null, new int[] {60, 65, 70});
        students[2] = new Student("Priya", null);
        students[3] = null;
        students[4] = new Student("Kiran", new int[] {30, 50, 60});

        StudentReport report = new StudentReport();

        System.out.println("Grades:");
        for (Student s : students) {
            try {
                if (s != null) {
                    System.out.println(s.getName() + " : " + report.validate(s));
                } else {
                    report.validate(s);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        StudentService service = new StudentService();

        System.out.println();
        System.out.println("Null Objects : " + service.findNumberOfNullObjects(students));
        System.out.println("Null Names   : " + service.findNumberOfNullNames(students));
        System.out.println("Null Marks   : " + service.findNumberOfNullMarksArray(students));
    }
}