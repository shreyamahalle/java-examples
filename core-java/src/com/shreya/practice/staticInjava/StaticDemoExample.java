package com.shreya.practice.staticInjava;

public class StaticDemoExample {
    int no;
    public void printNo(){
        System.out.println("value of number is " + no);
    }
    public static void main(String[] args) {
        StaticDemoExample staticDemoExample = new StaticDemoExample();
        staticDemoExample.no=10;
        staticDemoExample.printNo();
    }
}
