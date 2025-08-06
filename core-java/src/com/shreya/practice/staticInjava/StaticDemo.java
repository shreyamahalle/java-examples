package com.shreya.practice.staticInjava;

public class StaticDemo {

    int no;
    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        staticDemo.no = 10;
        staticDemo.printNo();
    }
    public void printNo() {
        System.out.println("number value " + no);
    }
}
