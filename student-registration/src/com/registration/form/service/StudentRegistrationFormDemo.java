package com.registration.form.service;

import com.registration.form.model.Student;

import java.util.Scanner;

public class StudentRegistrationFormDemo {
    public static void main(String[] args) {

        System.out.println("Enter the details..");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student first name.");
        String studentFirstName = sc.nextLine();

        System.out.println("Enter the student last name.");
        String studentLastName = sc.nextLine();

        System.out.println("Enter the student ID.");
        String studentId = sc.nextLine();

        Student s = new Student();
        s.studentFirstName = studentFirstName;
        s.studentLastName = studentLastName;
        s.studentId = studentId;

        System.out.println("Student Details! " + s);


    }
}
