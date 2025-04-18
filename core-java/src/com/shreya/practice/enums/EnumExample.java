package com.shreya.practice.enums;

import java.util.Scanner;

public class EnumExample {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter day of the week (e.g., MONDAY):");
        String input = sc.nextLine().trim().toUpperCase();

        try {
            Day today = Day.valueOf(input); // Convert string to enum

            switch (today) {
                case MONDAY:
                    System.out.println("Start of the work week!");
                    break;
                case FRIDAY:
                    System.out.println("Last working day!");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("It's the weekend! Holiday time.");
                    break;
                default:
                    System.out.println("Mid-week day!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered. Please try again.");
        }
    }

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
}
