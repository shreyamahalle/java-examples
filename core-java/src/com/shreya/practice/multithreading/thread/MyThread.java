package com.shreya.practice.multithreading.thread;

public class MyThread extends Thread {

    public void run() {
        System.out.println("my thread " + Thread.currentThread().getId() + "with " + Thread.currentThread().getName() +
                " is running");
        System.out.println("thread " + Thread.currentThread().getThreadGroup());
    }
}
