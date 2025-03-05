package src.com.practice.java8Features.functionInterface.demo;

public class InterestCalculationDemo {

    public static void main(String[] args) {
    InterestCalculator interestCalculator = (principalAmount, interestRate, years) ->
         (principalAmount * interestRate / 100) * years;

    double interest =  interestCalculator.calculate(1000,8.9,5);
        System.out.println("interest " + interest);
    }
  }
