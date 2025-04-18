package com.shreya.practice.multithreading.otherOperations;

public class ThreadYieldMethodDemo extends Thread {
    public static void main(String[] args) {
        ThreadYieldMethodDemo threadYieldMethodDemo = new ThreadYieldMethodDemo();
        ThreadYieldMethodDemo threadYieldMethodDemo1 = new ThreadYieldMethodDemo();

        threadYieldMethodDemo.start();
        threadYieldMethodDemo1.start();

        for (int i = 0; i < 4; i++) {
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + "running");

        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + "running");
        }
    }
}
