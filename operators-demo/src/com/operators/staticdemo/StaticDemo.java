package com.operators.staticdemo;

public class StaticDemo {
    int no;
    public static void main(String[] args) {
        StaticDemo ac = new StaticDemo();
        ac.no=10;
        ac.printNo();

        City.printCity();
    }
    public  void printNo(){
        System.out.println("Currently no's value = " + no);
    }
}
