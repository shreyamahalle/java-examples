package com.shreya.practice.constructor.defaultConstructor;

public class SimpleCode {
    public SimpleCode(){
        super();
        System.out.println("Constructor Called ");
    }

    public static void main(String[] args) {
        SimpleCode simpleCode = new SimpleCode();
    }
}
