package com.shreya.practice.exception.customExceptionHandling;

public class Voter {
    public static void main(String[] args) {
        int age = 15;
        try {
            if(age < 18){
                throw new InvalidAgeException("you are not eligible to vote");
            }
            else {
                System.out.println("you can vote");
            }
        }catch (InvalidAgeException e){
            System.out.println("Error " + e.getMessage());
        }

    }
}
