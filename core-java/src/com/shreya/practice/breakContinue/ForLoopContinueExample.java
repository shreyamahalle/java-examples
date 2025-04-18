package com.shreya.practice.breakContinue;

public class ForLoopContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                continue;//skip the reat of the loop when i = 3.
            }
            System.out.println("i = " + i);
        }
    }
}
