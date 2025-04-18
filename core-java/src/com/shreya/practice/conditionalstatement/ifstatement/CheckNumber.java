package com.shreya.practice.conditionalstatement.ifstatement;

import java.util.Scanner;

public class CheckNumber {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number");
        int no = scanner.nextInt();
        int i = 18;
        if (i < no) {
            System.out.println("number is greater than " + no);
        }
    }
}
