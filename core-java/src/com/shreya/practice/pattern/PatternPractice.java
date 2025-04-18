package com.shreya.practice.pattern;

public class PatternPractice {
    public static void main(String[] args) {
        int row = 0;
        while (row < 5) {

            int col = 0;
            while (col <= row) {
                System.out.print("*\t");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
