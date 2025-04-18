package com.shreya.practice.java8Features.functionInterface.additionalExamples;

interface Dog {
    void dogName(String name);
}

public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = (name) -> System.out.println("dog name is  " + name);
        dog.dogName("tom");
    }
}
