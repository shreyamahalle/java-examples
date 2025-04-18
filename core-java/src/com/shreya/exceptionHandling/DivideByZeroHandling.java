package src.com.shreya.exceptionHandling;

public class DivideByZeroHandling {
    public static void main(String[] args) {
        int no1 = 10, no2 = 0;

        int division=0;
        try{
             division = no1/no2;
        }catch (Exception e) {
            System.out.println("Division value must not be zero.");
            // System.exit(0);
        }
        System.out.println("Division " + division);
    }
}
