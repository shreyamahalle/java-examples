package com.shreya.practice.pattern;

public class WhileLoopPattern {
    public static void main(String[] args) {
        int row = 0;

        while (row <= 5) {
            System.out.println(row);


            int index = 0;
            while (index < row) {
                System.out.print(index + " \t");
                index++;
            }
            row++;
        }
    }
}
