package src.com.practice.java11features.lambdaWithLocalVariable;

public class LambdaWithLocalVariableDemo {
    public static void main(String[] args) {
        Interest1 interest1 = (principalAmount,  interestRatee) ->{

            return principalAmount *(interestRatee / 100) * 10;
        };
    }
}
