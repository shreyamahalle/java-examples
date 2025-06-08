package com.shreya.practice.oops.polymorphism.overriding;

public class ClassOverriding {
    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleService();
        vehicleService.move();
        //data hiding
        vehicleService = new CarService();
        vehicleService.move();
    }
}
