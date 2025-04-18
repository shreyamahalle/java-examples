package com.shreya.practice.java8Features.functionInterface.additionalExamples;

interface Lighting {
    void ligh(String name);
}

interface Decoration {
    void decorationFest(String decoration);
}

public class FunctionFestDemo {
    public static void main(String[] args) {
        Lighting lighting = (color) -> System.out.println("Light color is " + color);
        lighting.ligh("blue");

        Decoration decoration = (worm) -> System.out.println("Decoration for festival is worm " + worm);
        decoration.decorationFest("Haldi");

    }
}
