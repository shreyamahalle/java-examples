package com.shreya.practice.exception.customExceptionHandling;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}
