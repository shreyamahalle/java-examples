package com.shreya.practice.oops.inheritance.hierarchicalInheritance;

class Animal {
    void sound() { System.out.println("Animal makes sound"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Dog barks"); }
}

class Cat extends Animal {
    void meow() { System.out.println("Cat meows"); }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.meow();
        cat.sound();
        System.out.println("---------------------");
        Dog dog = new Dog();
        dog.bark();
        dog.sound();

    }
}
