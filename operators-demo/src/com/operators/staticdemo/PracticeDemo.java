package com.operators.staticdemo;

import java.util.Scanner;

public class PracticeDemo {
    static int a;  //global variable

    public static void main(String[] args) {
        System.out.println("Enter value");
        PracticeDemo p = new PracticeDemo();
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        p.printDemo();
    }

    public void printDemo() {
        System.out.println("value " + a);
    }
}
