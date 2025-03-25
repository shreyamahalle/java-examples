package com.operators.logicalOperator;

import java.util.Scanner;

public class NumberTypeOR {
    private  static  final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter number");
        int no = sc.nextInt();

        if((no > 100) || (no % 2 == 0)){
            System.out.println("even number");
        }
        if((no < 100) || (no % 2 != 0)){
            System.out.println("odd number");

        }
    }
}
