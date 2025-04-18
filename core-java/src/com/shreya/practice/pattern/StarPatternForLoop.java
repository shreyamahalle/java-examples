package com.shreya.practice.pattern;

public class StarPatternForLoop {

    private static int pattern_size = 5;

    public static void main(String[] args) {
        for (int i = 0; i < pattern_size; i++) {
            for (int index = 0; index <= i; index++) {
                System.out.print("*\t");

            }
            System.out.println();
        }
    }
}