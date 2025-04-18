package com.shreya.practice.conditionalstatement.ifelse;

import java.util.Scanner;

public class voter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("you are eligible ");
        } else {
            System.out.println("you are not eligible");
        }
    }
}
