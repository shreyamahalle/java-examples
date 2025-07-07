package com.shreya.practice.exception.customException;

public class Book {
    public static void main(String[] args) {
        int id = -1;

        try{
            if(id <= 0){
                throw  new InvalidBookException("Book Id invalid");
            }else {
                System.out.println("Valid Book Id " + id);
            }
        }catch (InvalidBookException exception){
            System.err.println("Error " + exception.getMessage());
        }
    }
}
