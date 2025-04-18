package com.shreya.practice.java8Features.defaultAndStaticMethodsInterface.model;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle drawn");
    }

    public void print() {
        System.out.println("Circle is painted with base color...");
    }
}
