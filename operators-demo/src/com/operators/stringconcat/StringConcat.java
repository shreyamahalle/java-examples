package com.operators.stringconcat;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first string");
        String firstString = sc.nextLine();
        System.out.println("Please enter sencond string");
        String secondString = sc.nextLine();
        System.out.println("Two String Concatenation " + firstString + secondString);

    }
}
