package com.shreya.practice.oops.inheritance.singleinheritance;

public class SingleInheritance {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark();
        dog.sound();

    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends SingleInheritance {
    void bark() {
        System.out.println("Dog barks");
    }
}
