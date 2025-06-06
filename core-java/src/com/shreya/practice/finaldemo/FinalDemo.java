package com.shreya.practice.finaldemo;

public class FinalDemo {
    public static final String GREENTING_MSG_TO_WORLD = "Hello World..";
    public final String GREETING_MSG = "Hello city...";
    public final int DEFAULT_LOAD = 10;
    public final double DEFAULT_TEMP = 52.4;
    public final char DEFAULT_CHAR = 'a';
    public final boolean DEFAULT_FLAG = false;

    public static void main(String[] args) {
        FinalDemo f = new FinalDemo();
        System.out.println("msg " + f.GREETING_MSG);
        System.out.println("msg " + GREENTING_MSG_TO_WORLD);
        System.out.println("msg " + f.DEFAULT_FLAG);
        System.out.println("msg " + f.DEFAULT_CHAR);
        System.out.println("msg " + f.DEFAULT_LOAD);
        System.out.println("msg " + f.DEFAULT_TEMP);
    }
}
