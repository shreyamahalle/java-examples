package com.shreya.practice.strings.toString;

public class ToStringMethod {
    int rollNo;
    String name;
    String city;

    ToStringMethod(int rollNo,String name,String city){
        this.rollNo = rollNo;
        this.name = name;
        this.city = city;
    }
    public String toString(){ //override the toString Method()
        return rollNo + name + city;
    }
    public static void main(String[] args) {

        ToStringMethod toStringMethod = new ToStringMethod(1," shreya ","pune");
        System.out.println(" Details is " + toStringMethod);

    }
}
