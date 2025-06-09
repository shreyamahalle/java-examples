package com.shreya.practice.exception;

import com.shreya.practice.exception.customException.InvalidBookException;

import java.util.Scanner;

public class BookExceptionDemo {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InvalidBookException {

        System.out.println("Enter book id:");
        int bookId = 0;
        try {
            bookId = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            throw new InvalidBookException("Enter valid Book Id");
        }
        System.out.println("book id is " + bookId);
    }
}
