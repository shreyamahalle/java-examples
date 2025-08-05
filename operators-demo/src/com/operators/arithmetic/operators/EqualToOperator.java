package com.operators.arithmetic.operators;

import java.util.Scanner;

public class EqualToOperator {
    public static void main(String[] args) {
//        int a = 45;
//        int b = 23;
        System.out.println("enter value");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a != b) {
            System.out.println("a is not equal to b");
        } else {
            System.out.println("a is  equal to b");
        }
    }
}
