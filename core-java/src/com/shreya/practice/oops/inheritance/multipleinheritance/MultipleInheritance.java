package com.shreya.practice.oops.inheritance.multipleinheritance;

interface Flyable {
     default void fly() {
        System.out.println("Duck flies");
    }
}

interface Swimmable {
     default void swim() {
        System.out.println("Duck swims");
    }

}

public class MultipleInheritance implements Flyable, Swimmable {

    public static void main(String[] args) {
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.fly();
        multipleInheritance.swim();
    }
}
