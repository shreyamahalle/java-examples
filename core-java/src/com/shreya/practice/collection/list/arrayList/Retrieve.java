package com.shreya.practice.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to retrieve an element (at a specified index) from a given array list.
public class Retrieve {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("Pink");
        colors.add("Red");
        colors.add("Pink");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Purple");
        System.out.println("retrieve " + colors.get(3));
    }
}