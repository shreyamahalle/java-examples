package src.com.practice;
import java.util.Scanner;
public class SplitNumbers {
    private  static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter positive number: ");
        int no = sc.nextInt();

        System.out.println("Split digit:");
        int remainder = 0;
        while (no > 0){
            remainder = no % 10;
            System.out.println(remainder);
            no = no / 10;
        }
    }
}
