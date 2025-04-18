package com.shreya.practice.finaldemo.finalClass;

// This class is declared as final
final class Vehicle {
    public void displayInfo() {
        System.out.println("This is a vehicle.");
    }
}

// Attempting to extend this class will cause a compile-time error
// class Car extends Vehicle {   // ❌ Error!
// }

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.displayInfo();
    }
}
