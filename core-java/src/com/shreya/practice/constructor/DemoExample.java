package com.shreya.practice.constructor;

public class DemoExample {
    int no;

    public DemoExample(){
        no = 10;
    }
    public static void main(String[] args) {
        DemoExample demoExample = new DemoExample();
        System.out.println(demoExample.no);
    }
}
