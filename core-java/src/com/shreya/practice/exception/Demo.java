package com.shreya.practice.exception;

public class Demo {
    public static void main(String[] args) {
        try {
            int result = 10 / 5;
            System.out.println("Result " + result);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred " + e.getMessage());
            throw new RuntimeException(e);
        } finally {
            System.out.println("this will always execute");
        }
    }
}
