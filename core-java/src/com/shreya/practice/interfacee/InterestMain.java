package com.shreya.practice.interfacee;

public class InterestMain {

    public static void main(String[] args) {
        SimpleInterest simpleInterest = new SimpleInterest();
        System.out.println("Simple Interest for one year " + simpleInterest.calculate(8.5,200000));
        System.out.println("Simple Interest for five year " + simpleInterest.calculate(8.5,200000,5));
    }
}
