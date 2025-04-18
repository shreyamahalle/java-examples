package com.shreya.practice.java8Features.defaultAndStaticMethodsInterface;

import com.shreya.practice.java8Features.defaultAndStaticMethodsInterface.model.Circle;
import com.shreya.practice.java8Features.defaultAndStaticMethodsInterface.model.Shape;
import com.shreya.practice.java8Features.defaultAndStaticMethodsInterface.model.Square;

public class DefaultAndStaticMethodDemo {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.print();
        Shape.erase();

        System.out.println("------------------------------");

        shape = new Square();
        shape.draw();
        shape.print();
        Shape.erase();
    }
}
