package com.operators.logicalOperator;

import java.util.Scanner;

public class LogicalAndOperator {
    public static void main(String[] args) {
        //pseudocode
        //if(no is greater than 0 and less than 1000 or not)
        //print condition matching all good
        //print condition not matching all not good
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        String no = sc.nextLine();

        if(Integer.valueOf(no) > 0 && Integer.valueOf(no) < 1000){
            System.out.println("condition matching all good");
        }
        else{
            System.out.println("condition not matching all not good");
        }
    }
}
