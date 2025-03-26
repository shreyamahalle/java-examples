package com.operators.logicalOperator;

import java.util.Scanner;

public class ORExampleDemo {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number");
        int no = sc.nextInt();

        if((no > 100)  || (no % 2 == 0)){
            System.out.println("number is higher");
        }
        if((no < 100 ) || (no % 2 != 0)){
            System.out.println("number is lower");
        }
    }
}
