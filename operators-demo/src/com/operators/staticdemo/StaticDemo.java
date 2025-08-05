package com.operators.staticdemo;

public class StaticDemo {
    static int no;

    public static void main(String[] args) {
//        StaticDemo ac = new StaticDemo();
//        ac.no=10;
//        ac.printNo();
        no = 10;
        printNo();

        City.printCity();
    }

    public static void printNo() {
        System.out.println("Currently no's value = " + no);
    }
}
