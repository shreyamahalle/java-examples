package com.shreya.practice.java8Features.defaultAndStaticMethodsInterface.model;

public interface Shape {
    static void erase() {
        System.out.println("base shape has been erased.");
    }

    void draw();

    default void print() {
        System.out.println("base printing done");
    }
}

