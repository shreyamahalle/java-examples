package com.shreya.practice.innerClazz;

public class InnerClassDemo {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine("1.0 ltr turbo ", "petrol");
        Car car = new Car(200, "BMW", "xse300", engine);

        System.out.println("Car Details " + car);

        printCarDetails(car);
        printCEngineDetails(car.engine);

    }

    private static void printCarDetails(Car car) {
        System.out.println("Car Details " + car);
    }

    private static void printCEngineDetails(Car.Engine engine) {
        System.out.println("Car Details " + engine);

    }
}
