package com.shreya.practice.strings;

//example to create immutable class //immutable means once we create we can not change
public record Employee(String panCardNo) {

    public static void main(String[] args) {
        Employee employee = new Employee("PCV54");

    }
}
