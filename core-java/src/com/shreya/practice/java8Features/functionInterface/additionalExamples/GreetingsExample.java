package com.shreya.practice.java8Features.functionInterface.additionalExamples;

interface Greetings {
    void sayHello();
}

interface GreetingsToAll {
    void SayHelloToAll(String name);
}

public class GreetingsExample {
    public static void main(String[] args) {
        Greetings greetings = () -> System.out.println("Hello ");
        greetings.sayHello();

        GreetingsToAll greetingsToAll = (name) -> System.out.println("Hi " + name);
        greetingsToAll.SayHelloToAll("pune");
    }
}
