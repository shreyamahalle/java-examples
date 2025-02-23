package src.com.practice.oops.inheritance.service;

import java.awt.*;

public class Circle extends BaseShape {

    public Circle(String color) {
        super(color);
    }

    public Circle() {
        super("red");
    }

    public void draw(){
        System.out.println("Circle drawn " + this.color);
    }
}
