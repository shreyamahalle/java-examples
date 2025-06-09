package com.shreya.practice.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to iterate through all elements in an array list.
public class Iterator {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("Pink");
        colors.add("Red");
        colors.add("Pink");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Purple");

        for (String list : colors) {
            System.out.println("color list is " + list);
        }
    }
}
