package com.shreya.practice.interfacee.interest;

public class InterestMain {

    public static void main(String[] args) {
        SimpleInterest simpleInterest = new SimpleInterest();
        System.out.println("Simple Interest for one year " + simpleInterest.calculate(8.5,200000));
        System.out.println("Simple Interest for five year " + simpleInterest.calculate(8.5,200000,5));

        System.out.println("----------------------------------------------------------------------------------------");

        CompoundInterest compoundInterest = new CompoundInterest();
        System.out.println("Compound Interest for 1 year " + compoundInterest.calculate(8.5,200000));
        System.out.println("Compound Interest for 5 year " + compoundInterest.calculate(8.5,200000,5));




    }
}
