package com.shreya.practice.oops.abstraction.animal;

abstract class Animal {
    abstract void sound();   //Abstract method nobody

    void sleep() {            // non-abstract method
        System.out.println("Animal sleeping..");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
        obj.sleep();
    }
}