package com.shreya.practice.object;

public class Test {

    public static void main(String[] args) {
        Object test = new Test();
        ((Test) test).hello();

    }

    private void hello() {
        System.out.println("greeting");

    }
}
