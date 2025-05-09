package com.shreya.practice.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUnderstandDemo {

    public static void main(String[] args) {

        List<Integer> marksList = new ArrayList<>();

        marksList.add(90);
        marksList.add(99);
        marksList.add(90);
        marksList.add(90);
        marksList.add(98);
        marksList.add(40);
        marksList.add(60);

        System.out.println("marks is " + marksList);

        List<String> flowerList = new ArrayList<>();

        flowerList.add("lotus");
        flowerList.add("rose");
        flowerList.add("sunflower");
        flowerList.add("iris");
        flowerList.add("bell");
        flowerList.add("marigold");

        System.out.println("flowers is " + flowerList);
    }
}
