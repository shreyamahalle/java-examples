package com.shreya.practice.multithreading.runnable;

public class MyRunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("my thread " + Thread.currentThread().getId() + "with " + Thread.currentThread().getName() +
                " is running");
        //System.out.println("thread " + Thread.currentThread().getThreadGroup());
    }
}
