package com.operators.staticdemo;

import java.util.Scanner;

public class AdvanceStaticDemo {
    static int staticNo;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        staticNo = sc.nextInt();

        AdvanceStaticDemo a = new AdvanceStaticDemo();
        a.printNo();

        AdvanceStaticDemo a1 = new AdvanceStaticDemo();
        a1.printNo();

        // a.staticNo = 10;
        //a1.printNo();
    }

    public void printNo() {
        System.out.println("static number = " + staticNo);
    }
}
