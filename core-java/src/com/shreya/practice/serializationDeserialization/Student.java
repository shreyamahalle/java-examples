package com.shreya.practice.serializationDeserialization;

import java.io.Serializable;

public class Student implements Serializable {
    int rollNo;
    public String name;
    private Address address;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student: {" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    static class Address implements Serializable {
        String city;

        public Address(String city) {
            this.city = city;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    '}';
        }
    }
}