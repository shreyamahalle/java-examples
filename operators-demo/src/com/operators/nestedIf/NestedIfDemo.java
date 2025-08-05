package com.operators.nestedIf;

import java.util.Scanner;

public class NestedIfDemo {
    //pseudocode
    //print message to enter no
    //accept no convert to int
    //if no is positive
    //if it is positive  - check it is even or odd
    //if it is even - check if it is greater than 100
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int no = Integer.parseInt(sc.next());

        if (no < 0 && no > 0) {
            System.out.println("number is even");
        }

    }


}