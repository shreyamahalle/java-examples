package com.shreya.practice.oops.inheritance.service;

import com.shreya.practice.oops.inheritance.model.Address;
import com.shreya.practice.oops.inheritance.model.Programmer;

import java.util.Scanner;

public class InheritanceDemo {

    public static void main(String[] args) {

        System.out.println("Please enter name of employee:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Please enter city of employee:");
        String city = scanner.nextLine();

        System.out.println("Please enter employee Id of employee:");
        String employeeId = scanner.nextLine();

        System.out.println("Please enter dept of employee:");
        String dept = scanner.nextLine();

        System.out.println("Please enter salary of employee:");
        String salary = scanner.nextLine();

        System.out.println("Please enter working language of employee:");
        String workingLanguage = scanner.nextLine();

        Programmer programmer = new Programmer();
        programmer.setName(name);
        Address address = new Address();
        address.city = city;
        programmer.setAddress(address);
        programmer.setDept(dept);
        programmer.employeeId = Integer.parseInt(employeeId);
        programmer.setSalary(Integer.parseInt(salary));
        programmer.workingLanguage = workingLanguage;


        System.out.println(programmer);
    }
}

