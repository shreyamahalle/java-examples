package com.operators.arithmetic.operators;

import java.util.Scanner;

public class ModuloOperatorDemo {
    //pseudocode
    // take number and check if no is divisible by 2 - output
    // if number is divisible by 2 - what is remainder?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter the value");
        int no = Integer.parseInt(sc.next());
        System.out.println("Pls enter the divisible value");
        int divisibleValue = Integer.parseInt(sc.next());

        int output = no / divisibleValue;
        int remainder = no % divisibleValue;

        System.out.println("divisible output" + output);
        System.out.println("divisible remainder" + remainder);
    }

}
