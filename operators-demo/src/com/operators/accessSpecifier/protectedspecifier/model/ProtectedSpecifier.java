package com.operators.accessSpecifier.protectedspecifier.model;

public class ProtectedSpecifier {
    public static void main(String[] args) {
        Building b = new Building();
        b.city = "mumbai";
        b.id = 1;
        b.name = "residency";
        System.out.println("Building " + b);
    }
}
