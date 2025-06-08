package com.shreya.practice.oops.encapsulation;

class Person{
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class TestEncapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAddress("Pune");
        person.setAge(21);
        System.out.println("name is " + person.getName());
        System.out.println("Address is " + person.getAddress());
        System.out.println("Age is " + person.getAge());
    }
}
