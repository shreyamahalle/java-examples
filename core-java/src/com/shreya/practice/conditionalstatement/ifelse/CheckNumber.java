package com.shreya.practice.conditionalstatement.ifelse;

import java.util.Scanner;

public class CheckNumber {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number to check....");
        int no = scanner.nextInt();
        int i = 1;

        if (i < no) {
            System.out.println("this number is greater ");
        } else {
            System.out.println("this number is not greater ");
        }
    }
}
