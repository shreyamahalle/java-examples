package com.operators.relational;

import java.util.Scanner;

public class GradingDemo {
    //pseudocode
    //if marks is less then 40 then D.
    // marks is greater than 40 to 60 . c grade
    // marks is greater then 60 to 80 b grade
    // greater then 80 A grade.

    public static void main(String[] args) {
        System.out.println("Enter the marks..");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        if(grade >= 80){
            System.out.println("A grade");
        }
        else if(grade>=60 && grade < 80){
            System.out.println("B grade");
        }
        else if(grade >=40 && grade<60){
            System.out.println("C grade");
        }
        else{
            System.out.println("D");
        }
    }
}
