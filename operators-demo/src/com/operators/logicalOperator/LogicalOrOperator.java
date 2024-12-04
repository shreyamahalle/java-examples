package com.operators.logicalOperator;

import java.util.Scanner;

public class LogicalOrOperator {
    //pseudocode
    //if(no is divisible by 17 or divisible by 2)
    //print - condition matching found the match value.
    //print condition not matching all not good

    public static void main(String[] args) {
        System.out.println("Enter value");
        Scanner sc = new Scanner(System.in);
        String no = sc.nextLine();

        if (Integer.parseInt(no) % 17 == 0 || Integer.parseInt(no) % 2 == 0) {
            System.out.println("condition matching found the match value.");
        } else {
            System.out.println("condition not matching all not good.");
        }
    }
}
