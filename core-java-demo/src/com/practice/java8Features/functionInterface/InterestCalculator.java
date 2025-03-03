package src.com.practice.java8Features.functionInterface;
@FunctionalInterface
public interface InterestCalculator {
    double calculate(int principalAmount, double interestRate, int years);
    //double calculate(int principalAmount, double interestRate);


}
