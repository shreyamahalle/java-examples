package com.shreya.servlet.service;

public class HelloService {

    public String greet(String name) {
        return "hello " + (name.isBlank() ? "world!!" : name);
    }
}