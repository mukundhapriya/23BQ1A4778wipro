package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    // TC4, TC5, TC6 kosam
    public void validate(Student student)
            throws NullStudentObjectException,
                   NullNameException,
                   NullMarksArrayException {

        if (student == null)
            throw new NullStudentObjectException();

        if (student.getName() == null)
            throw new NullNameException();

        if (student.getMarks() == null)
            throw new NullMarksArrayException();
    }

    // TC1, TC2, TC3 kosam
    public String findGrades(Student student) {

        int[] marks = student.getMarks();

        // Any mark below 35 -> F
        for (int mark : marks) {
            if (mark < 35) {
                return "F";
            }
        }

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        int avg = total / marks.length;

        if (avg >= 80)
            return "A";
        else if (avg >= 60)
            return "B";
        else if (avg >= 40)
            return "C";
        else
            return "D";
    }
}