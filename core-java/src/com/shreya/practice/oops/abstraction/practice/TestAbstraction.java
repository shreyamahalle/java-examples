package com.shreya.practice.oops.abstraction.practice;

abstract class Shape {
    abstract void draw();

}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {

        //data hiding
        Shape s = new Circle();
        s.draw();
    }
}