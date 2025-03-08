package src.com.shreya.oops.polymorphism.overloading;

public class MethodOverloadingDemo {
    private static final double interest_rate = 8;

    public double calculate(int principleAmount){
        return (principleAmount * interest_rate * 1)/100;
    }

    public double calculate(int principleAmount, int year){
        return (principleAmount * interest_rate * 1)/100;
    }

    public double calculate(int principleAmount, int year, double interestRate){
        return (principleAmount * interestRate * 1)/100;
    }

}
