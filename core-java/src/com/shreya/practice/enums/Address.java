package com.shreya.practice.enums;

enum Direction {
    EAST("east"), WEST("west"), SOUTH("a"), NORTH("a");

    Direction(String east) {
    }
}

public class Address {
    String city;
    int pincode;
    Direction direction;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode=" + pincode +
                ", direction=" + direction +
                '}';
    }
}

