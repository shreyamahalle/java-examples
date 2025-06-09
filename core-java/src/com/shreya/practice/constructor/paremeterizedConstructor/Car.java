package com.shreya.practice.constructor.paremeterizedConstructor;

public class Car {
    int modelYear;
    String modelName;

    public Car(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public static void main(String[] args) {
        Car car = new Car(2000, "honda");
        System.out.println(car.modelYear + " " + car.modelName);
    }
}
