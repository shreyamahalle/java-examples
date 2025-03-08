package src.com.shreya.java11features.lambdaWithLocalVariable;

public class LambdaWithLocalVariableDemo {
    public static void main(String[] args) {
        Interest1 interest1 = (principalAmount,  interestRatee) ->{
            int year = 1;
            return principalAmount *(interestRatee / 100) * year;
        };

        double totalInterest = interest1.calculate(32534,5.65f);
        System.out.println("Total interest " + totalInterest);
    }
}
