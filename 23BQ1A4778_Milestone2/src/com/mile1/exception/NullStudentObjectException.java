package com.mile1.exception;

public class NullStudentObjectException extends Exception {

    public NullStudentObjectException() {
        super("Student object is null");
    }
}