package com.shreya.practice.constructor.paremeterizedConstructor;

public class ConstructorDemo {
    public static void main(String[] args) {
        ConstructorDemoTrain constructorDemoTrain = new ConstructorDemoTrain();
        constructorDemoTrain.setTrainId(101);
        constructorDemoTrain.setTrainName("Bharat");

        ConstructorDemoTrain constructorDemoTrain1 = new ConstructorDemoTrain(102, "Banaras");
//        constructorDemoTrain1.setTrainId(102);
//        constructorDemoTrain1.setTrainName("Banaras");

        System.out.println("Train1 " + constructorDemoTrain);
        System.out.println("Train2 " + constructorDemoTrain1);
    }
}
