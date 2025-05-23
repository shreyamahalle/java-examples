package com.shreya.practice.collection.list.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class AllLinkedListMethods {

    public static void main(String[] args) {
        //Write a Java program to append the specified element to the end of a linked list.
        LinkedList<String> list = new LinkedList<>();
        list.add("red");
        list.add("green");
        list.add("black");
        list.add("white");
        list.add("pink");
        list.add("yellow");
        System.out.println("LinkedList is " + list);
        System.out.println("============================");

        //Write a Java program to iterate through all elements in a linked list.
        System.out.println("Original LinkedList is " + list);
        for (String element : list){
            System.out.println(element);
        }

        System.out.println("============================");
        //Write a Java program to iterate through all elements in a linked list starting at the specified position.
        System.out.println("Original LinkedList is " + list);
        Iterator iterator = list.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("============================");





        System.out.println("============================");
    }
}
