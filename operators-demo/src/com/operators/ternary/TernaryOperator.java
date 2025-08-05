package com.operators.ternary;

import java.util.Scanner;

public class TernaryOperator {
    //pseudocode:
    //accept the no as input.
    //check if no is less than 0
    //print negative no
    //else print positive no
    public static void main(String[] args) {
        System.out.println("Enter the value:");
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        //ternary operator represent
        System.out.println((input < 0) ? "negative number" : "positive number");
    }
}
