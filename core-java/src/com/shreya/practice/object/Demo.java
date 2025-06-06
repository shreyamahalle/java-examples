package com.shreya.practice.object;

public class Demo {

    static String city = "Pune";

    public static void main(String[] args) {
        Demo demo1 = new Demo();
        Demo demo2 = new Demo();
        System.out.println("step-1: demo1.city " + demo1.city + "| demo2.city " + demo2.city);

        demo1.city = "Mumbai";
        System.out.println("step-2: demo1.city " + demo1.city + "| demo2.city " + demo2.city);

        demo2.city = "Delhi";
        System.out.println("step-3: demo1.city " + demo1.city + "| demo2.city " + demo2.city);
    }
}
