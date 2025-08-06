package com.shreya.practice.number;

import java.util.Scanner;

public class OddNumberr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to check odd or even");
        int no = Integer.parseInt(sc.nextLine());
        if (no % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }
}
