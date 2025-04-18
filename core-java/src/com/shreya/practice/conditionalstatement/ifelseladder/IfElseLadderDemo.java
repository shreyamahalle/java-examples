package com.shreya.practice.conditionalstatement.ifelseladder;

import java.util.Scanner;

public class IfElseLadderDemo {
    //pseudocode
    //if else ladder example
    //enter marks a b c d to check grade.
    public static void main(String[] args) {
        System.out.println("Enter your marks");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        //int marks = 65;
        if (marks < 50) {
            System.out.println("fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("B grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("A grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A++ grade");
        } else {
            System.out.println("Invalid!");
        }
    }
}
