package com.shreya.practice.loop;

import java.util.Scanner;

public class StringSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day");
        String day = scanner.nextLine();
                switch (day) {
                    case "Monday":
                        System.out.println("Start of the work week.");
                        break;
                    case "Tuesday":
                        System.out.println("Another work day.");
                        break;
                    case "Wednesday":
                        System.out.println("Mid-week.");
                        break;
                    case "Thursday":
                        System.out.println("Almost Friday!");
                        break;
                    case "Friday":
                        System.out.println("TGIF!");
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.println("Weekend!");
                        break;
                    default:
                        System.out.println("Invalid day.");
                        break;
                }
            }
        }

