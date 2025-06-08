package com.shreya.practice.oops.inheritance.demo;

public class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.sound();
    }

    void bark() {
        System.out.println("dok barks");
    }
}
