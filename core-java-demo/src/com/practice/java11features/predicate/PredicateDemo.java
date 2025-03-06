package src.com.practice.java11features.predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        //PredicateDemo predicateDemo = new PredicateDemo();

         Predicate<Integer> greaterThanNo = (no) ->   no > 100;

        System.out.println("no greater than 100? " + greaterThanNo.test(190));
    }
//    public boolean greaterThanNo(int no){
//        return  no > 100;
//    }
}
