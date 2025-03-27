package src.com.shreya.number;

import java.util.Scanner;

public class PrimeNumberDoWhileLoop {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter no....");
        int no = scanner.nextInt();

        int index = 1;
        do {
            index++;

        } while (no % index != 0); //&& no > index);

        if (index == no) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}