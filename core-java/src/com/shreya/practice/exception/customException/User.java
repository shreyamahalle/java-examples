package com.shreya.practice.exception.customException;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter user ID: ");
        int userId = sc.nextInt();

        try {
            if (userId <= 0) {
                throw new UserNotFoundException("User ID must be greater than 0");
            } else {
                System.out.println("Valid User ID: " + userId);
            }
        } catch (UserNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
