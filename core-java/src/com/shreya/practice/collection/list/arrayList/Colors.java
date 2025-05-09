package com.shreya.practice.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to create an array list.add some colors (strings) and print out the collection.
public class Colors {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("Red");
        colors.add("Pink");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Purple");

        System.out.println("Colors is " + colors);
        System.out.println("Colors size() is " + colors.size());
    }
}
