package src.com.shreya.conditionalstatement.ifelseladder;
import java.util.Scanner;

public class NewIFElseEvenOddNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int no = scanner.nextInt();

            System.out.println((no % 2 == 0)? "number is even" : "number is odd");

    }
}
