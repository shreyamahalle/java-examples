package com.operators.bitwise;

import java.util.Scanner;

public class BitwiseOrOperator {
    static  int fNumber=0;
    static  int sNumber=0;
    private static void bitwiseOrOperator(){
        int result = fNumber | sNumber;
        System.out.println("bitwise or operator " + result);
    }
    public static void main(String[] args) {
        System.out.println("please enter 2 value");
        Scanner sc = new Scanner(System.in);
        fNumber = sc.nextInt();
        sNumber = sc.nextInt();

        bitwiseOrOperator();
    }
}
