package com.shreya.practice.loop.whileLoop;
public class Practiceeee {
    public static void main(String[] args) {
        int no = 0;
        while (no <= 10){
            System.out.println("number is " + no);
            ++no;
        }
        //do-while
        do {
            System.out.println("no " + no);
            no++;
        }while (no <= 10);
    }
}
