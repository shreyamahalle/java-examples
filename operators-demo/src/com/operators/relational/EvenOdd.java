package com.operators.relational;

import java.util.Scanner;

public class EvenOdd {
    //pseudocode
    //check number is even or odd.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to check no is even or odd");
        int no = sc.nextInt();

//        if(no % 2 ==0)
//            System.out.println("Number is even..");
//
//        else
//            System.out.println("Number is odd");

        //Ternary operator
        // System.out.println((no % 2 == 0) ? "This is even no" : " This is odd number");
        System.out.println((no % 2 == 0) ? "This no is even using ternary operator " : " odd");

    }
}
