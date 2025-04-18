package com.shreya.practice.object;

public class ObjectDemo {
    public static void main(String[] args) {
        Object object = "shreya";
        object = 1;
        object = "shreya";
        object = 2345678;
        object = true;
        object = new Student();
        System.out.println("Object " + object);
    }

    static class Student {
        int rollno;
        String name;
    }
}
