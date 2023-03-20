package com.example.studentmanagementsystem1.exception;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(Long studentId){
        super("Could not found the student with studentId"+ studentId);
    }

}
