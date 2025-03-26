package com.operators.instanceofoperator;

//instance of operator check the type
public class InstanceDemo {

    public static void main(String[] args) {
        String name = "shreya";
        Integer number = 22;
        Double temp = 35.77;

        if(name instanceof String){
            System.out.println("type of name is string ");
        }else{
            System.out.println("type of name is not string ");
        }
        if(number instanceof Integer){
            System.out.println("type of number is integer ");
        }else{
            System.out.println("type of number is not integer ");
        }
        if(temp instanceof Double){
            System.out.println("type of temp is double ");
        }else{
            System.out.println("type of temp is not double ");
        }
        }
    }

