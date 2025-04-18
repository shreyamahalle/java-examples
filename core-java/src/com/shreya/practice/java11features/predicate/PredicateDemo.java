package com.shreya.practice.java11features.predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        //PredicateDemo predicateDemo = new PredicateDemo();

        Predicate<Integer> greaterThanNo = (no) -> no > 100;

        System.out.println("no greater than 100? " + greaterThanNo.test(190));

        Predicate<String> inStringContainsZero = (input) -> input.contains("0");

        System.out.println("inStringContainsZero " + inStringContainsZero.test("hiiiiii10"));
    }


    //old fashion code
//    public boolean greaterThanNo(int no){
//        return  no > 100;
//    }

    public boolean inStringContainsZero(String input) {
        return input.contains("0");
    }
}
