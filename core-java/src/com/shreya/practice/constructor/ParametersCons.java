package com.shreya.practice.constructor;

public class ParametersCons {
    int x;
    public ParametersCons(int x){
       this.x = x;
    }

    public static void main(String[] args) {
        ParametersCons parametersCons = new ParametersCons(10);
        System.out.println(parametersCons.x);
    }
}
