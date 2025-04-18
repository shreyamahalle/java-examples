package com.shreya.practice.collection.set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<>();
        hashset.add(1);
        hashset.add(2);
        System.out.println(hashset.clone());
        System.out.println("hashset example " + hashset);
        System.out.println(hashset.size());

    }
}
