package com.shreya.practice.number.practiceNumber;

public class ReverseStringg {
    public static void main(String[] args) {
        String str = "Hello World";
        String revered = " ";

        for(int i = str.length()-1; i>=0; i--){
            revered += str.charAt(i);
        }
        System.out.println("Reversed " + revered);
    }
}
