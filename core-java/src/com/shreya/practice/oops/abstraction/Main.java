package com.shreya.practice.oops.abstraction;

abstract class Animal {
    void animal() {
        System.out.println("this is abstract class method");

    }

    abstract void sound();// No body = abstract rule

}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat say......");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog say......");

    }

}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
        cat.animal();
    }
}