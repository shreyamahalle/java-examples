package com.shreya.practice.oops.polymorphism.overloading;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class TestOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 6));
        System.out.println(calculator.add(2, 5, 8));
    }
}

