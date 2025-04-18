package com.shreya.practice.java8Features.functionInterface.demo;

@FunctionalInterface
public interface InterestCalculator {
    double calculate(int principalAmount, double interestRate, int years);
    //double calculate(int principalAmount, double interestRate);
}
