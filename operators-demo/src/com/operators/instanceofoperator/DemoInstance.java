package com.operators.instanceofoperator;
public class DemoInstance {
    public static void main(String[] args) {
        Integer temp = 10;
        String str = "ABCA";
        if (temp instanceof Integer) {
            System.out.println("this value is int");
        } else {
            System.out.println("this value is not int");
        }
        if (str instanceof String) {
            System.out.println("string");
        } else {
            System.out.println("not string");
        }
    }
}
