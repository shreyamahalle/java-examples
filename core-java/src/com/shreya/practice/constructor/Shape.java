package com.shreya.practice.constructor;

public class Shape {

    private static String type;
    private int radius;

    //parameterized constructor
    public Shape(int radius) {
        this.radius = radius;
        System.out.println("Shape parameterized constructor initialized");
    }

    //no parameterized constructor
    public Shape() {
        System.out.println("Shape default constructor");
    }

    public static void main(String[] args) {
        Shape.type = "circle";

        Shape circle1 = new Shape();
        circle1.radius = 5;
        circle1.print();

        Shape circle2 = new Shape(7);
        circle2.print();

        Shape circle3 = new Shape(9);
        circle3.print();
    }

    public void print() {
        System.out.println("Radius of this shape is " + radius + " and shape is " + type);
    }
}
