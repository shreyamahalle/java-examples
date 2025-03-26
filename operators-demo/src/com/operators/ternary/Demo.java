package com.operators.ternary;

import java.util.Scanner;

public class Demo {

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        int no = 10;
//        System.out.println((no % 2 == 0) ? "this is even no" : " this id odd no");

        System.out.println("enter value positive or negative ");

        int no = sc.nextInt();

        System.out.println((no % 2 ==0) ? "this is even no" : "this is odd no");
    }
}
