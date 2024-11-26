package com.registration.form.model;

public class Student {
    public String studentFirstName;
    public  String studentLastName;
    public String studentId;

    @Override
    public String toString() {
        return "Student{" +
                "studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}

