package com.shreya.practice.oops.inheritance.service;

public class BaseShape {

    public String color;

    public BaseShape(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("base shape drawn with color " + this.color);

    }
}
