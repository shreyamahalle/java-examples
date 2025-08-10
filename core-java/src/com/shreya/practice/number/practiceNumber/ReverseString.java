package com.shreya.practice.number.practiceNumber;
//String shreya

public class ReverseString {
    public static void main(String[] args) {
        String str = "Shreya";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed " + reversed);

    }
}
