package com.shreya.practice.collection.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Write a Java program to remove the third element from an array list.
public class Remove {
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
        System.out.println(colors.remove(2));
        System.out.println("Colors is " + colors);

        //Write a Java program to search for an element in an array list.
        if (colors.contains("Red")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
        System.out.println(colors.contains("Pink") ? "Found the element" : "There is no such element");

   //Write a Java program to sort a given array list.
        Collections.sort(colors);
        System.out.println("sorted list " + colors);

        for(int i = 0 ; i< colors.size(); i++){
            System.out.println("element at " + i + ":" + colors.get(i));
     //Write a Java program to replace the second element of an ArrayList with the specified element.
       String newElement = "ryghgehgj";
       String result = (colors.size() > 1)
            ? (colors.set(1,newElement) != null? "replace" :"not")
               : "ArrayList does not have a second element to replace.";
            System.out.println("new" + colors);
        }
    }
}