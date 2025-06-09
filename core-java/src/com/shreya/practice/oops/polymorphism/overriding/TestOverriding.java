package com.shreya.practice.oops.polymorphism.overriding;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }
}

public class TestOverriding {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.sound();

        //data hiding
        Animal a = new Cat();  // reference type Animal, object type Cat
        a.sound();// Cat meows
    }
}
