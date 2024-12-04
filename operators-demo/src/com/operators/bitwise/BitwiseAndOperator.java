package com.operators.bitwise;

import java.util.Scanner;

public class BitwiseAndOperator {
    static  int fNumber;
    static  int sNumber;
    private static void bitwiseAndOperator(){
        int result = fNumber & sNumber;
        System.out.println("bitwise and operator " + result);
    }
    public static void main(String[] args) {
        System.out.println("please enter 2 value");
        Scanner sc = new Scanner(System.in);
        fNumber = sc.nextInt();
        sNumber = sc.nextInt();

        bitwiseAndOperator();
    }
}
