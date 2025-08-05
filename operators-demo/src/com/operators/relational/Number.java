package com.operators.relational;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if(n % 2 ==0){
            System.out.println("number is even");
        }else {
            System.out.println("no is odd");
        }
    }
}
