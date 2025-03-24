package src.com.shreya.practice;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int c = a + b;
//        System.out.println(c);
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b ;

        System.out.println("addition " + sum);
    }
}
