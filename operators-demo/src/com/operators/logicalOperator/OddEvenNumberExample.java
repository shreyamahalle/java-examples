package com.operators.logicalOperator;

import java.util.Scanner;

public class OddEvenNumberExample {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Number.!!!!");
        int no = sc.nextInt();

        if (no % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}