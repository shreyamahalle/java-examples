package com.operators.instanceofoperator;

import java.util.Scanner;

public class InstanceOfOperator {

    public static void main(String[] args) {
//        String city = "Pune";
//        Integer length = 3;
//        Double temp = 35.54;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the city name");
        String city = sc.next();
        System.out.println("enter the length");
        Integer length = sc.nextInt();
        System.out.println("enter the temp");
        Double temp = sc.nextDouble();

        if(city instanceof String){
            System.out.println("type of city is string");
        }
        else{
            System.out.println("type of city is not string");
        }
        if(length instanceof Integer){
            System.out.println("type of length is integer");
        }
        else{
            System.out.println("type of length is not integer");
        }
        if(temp instanceof Double){
            System.out.println("type of temp is double");
        }
        else{
            System.out.println("type of temp is not double");
        }
    }
}
