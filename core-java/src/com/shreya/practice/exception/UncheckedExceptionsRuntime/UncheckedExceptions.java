package com.shreya.practice.exception.UncheckedExceptionsRuntime;

public class UncheckedExceptions {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length()); // NullPointerException
    }
}
