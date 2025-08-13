package com.shreya.practice.pattern;
//*
//**
//***
//****
//*****

public class Development {
    public static void main(String[] args) {
        int i = 0;
        do{
            int j = 0;
            while (j <= i) {
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }while (i < 5);
    }
}
