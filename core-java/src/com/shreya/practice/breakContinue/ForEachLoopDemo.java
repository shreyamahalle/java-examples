package com.shreya.practice.breakContinue;

public class ForEachLoopDemo {
    public static void main(String[] args) {
        String[] name = {"shreya", "abc", "alia"};
        for (String n : name) {
            if (n.equals("abc")) {
                continue;
            }
            System.out.println(n);
        }
    }
}
