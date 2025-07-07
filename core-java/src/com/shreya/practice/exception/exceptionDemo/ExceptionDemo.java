package com.shreya.practice.exception.exceptionDemo;

import java.util.Arrays;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] marks = new int[5];

        marks[0] = 99;
        marks[1] = 86;
        marks[2] = 89;
        marks[3] = 67;
        marks[4] = 90;
        try {
            marks[5] = 90;
            System.out.println("marks [5] data completed");
        } catch (Exception exception) {
            System.err.println("you are doing something wrong.we have only 5 subjects." + exception.getMessage());

        }

        System.out.println("marks of the students is " + Arrays.toString(marks));
    }
}
