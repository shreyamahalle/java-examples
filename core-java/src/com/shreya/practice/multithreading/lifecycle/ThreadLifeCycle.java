package com.shreya.practice.multithreading.lifecycle;

public class ThreadLifeCycle {
    public static void main(String[] args) {
        ThreadLifeCycle threadLifeCycle = new ThreadLifeCycle();
        Thread secondarythreadLifeCycle = new Thread(String.valueOf(threadLifeCycle));
        System.out.println(secondarythreadLifeCycle.getState());
    }

    class Car implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(1800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("car");
        }
    }

    class Bike implements Runnable {

        @Override
        public void run() {
            Car car = new Car();
            Thread secondaryCarthread = new Thread(car);

            System.out.println("secondary thread " + secondaryCarthread.getState());
            secondaryCarthread.start();
            System.out.println("secondary thread after start() it " + secondaryCarthread.getState());
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Bike" + secondaryCarthread.getState());

            try {
                secondaryCarthread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("join");
            }
        }
    }
}
