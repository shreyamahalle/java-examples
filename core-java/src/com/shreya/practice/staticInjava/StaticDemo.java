package com.shreya.practice.staticInjava;

public class StaticDemo {

    static int no;

    public static void main(String[] args) {
//        StaticDemo staticDemo = new StaticDemo();
//        staticDemo.no = 10;
//        staticDemo.printNo();
        no = 10;
        printNo();
    }

    public static void printNo() {
        System.out.println("number value " + no);
    }
}
