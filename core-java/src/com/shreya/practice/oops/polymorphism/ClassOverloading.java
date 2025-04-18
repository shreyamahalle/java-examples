package com.shreya.practice.oops.polymorphism;

import com.shreya.practice.oops.polymorphism.overloading.MethodOverloadingDemo;

public class ClassOverloading {
    public static void main(String[] args) {
        MethodOverloadingDemo methodOverloadingDemo = new MethodOverloadingDemo();
        System.out.println("interest of 100 is " + methodOverloadingDemo.calculate(100));
        System.out.println("interest of 100 is " + methodOverloadingDemo.calculate(100, 6));
        System.out.println("interest of 100 is " + methodOverloadingDemo.calculate(100, 6, 243.3));


    }
}
