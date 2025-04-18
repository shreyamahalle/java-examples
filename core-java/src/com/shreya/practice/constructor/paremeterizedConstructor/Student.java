package com.shreya.practice.constructor.paremeterizedConstructor;

public class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "shreya");
        student1.display();
        student1.name = "shreya";
        student1.id = 101;
        System.out.println("name " + student1.name + " id is " + student1.id);

    }

    void display() {
        //System.out.println(id + " " + name);
    }
}
