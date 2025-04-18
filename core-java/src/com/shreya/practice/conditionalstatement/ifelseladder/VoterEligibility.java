package com.shreya.practice.conditionalstatement.ifelseladder;

import java.util.Scanner;

public class VoterEligibility {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("you are not eligible for vote you are under the age ");
        }
        if (age >= 18) {
            System.out.println("you are eligible for vote");
        } else {
            System.out.println("you are not eligible for vote");
        }

    }
}
