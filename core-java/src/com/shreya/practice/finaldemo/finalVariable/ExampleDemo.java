package com.shreya.practice.finaldemo.finalVariable;

public class ExampleDemo {

    final int speed = 80;

    public static void main(String[] args) {
        ExampleDemo exampleDemo = new ExampleDemo();
        exampleDemo.setSpeed();
    }

    void setSpeed() {
        System.out.println("speed is " + speed);
    }
}
