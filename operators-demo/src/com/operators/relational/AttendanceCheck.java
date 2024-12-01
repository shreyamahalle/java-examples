package com.operators.relational;
import java.util.Scanner;
public class AttendanceCheck {
    //pseudocode
    //check student attendance
    public static void main(String[] args) {
        System.out.println("Enter the number and check your attendance!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<=50){
            System.out.println("attendance is 50%");
        }
        else if(n<=75){
            System.out.println("Attendance is 75%");
        }
        else{
            System.out.println("Attendance is perfect");
        }
    }
}
