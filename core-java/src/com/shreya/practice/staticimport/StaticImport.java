package com.shreya.practice.staticimport;

import static com.shreya.practice.staticimport.service.HelloService.sayHello;

public class StaticImport {
    public static void main(String[] args) {
        sayHello("Shreya");
        sayHello("shreya", "amt");
    }
}
