package com.operators.logicalOperator;

import java.util.Scanner;

public class NumberTypeDemo {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int no = sc.nextInt();

        if((no % 2 == 0) && (no > 100)){
            System.out.println("number is golden");
        }
        else if((no % 2 == 0) && (no <= 100)){
                System.out.println(" number is golden");
            }
        else if((no % 2 == 0) && (no <= 100)){
            System.out.println(" number is golden");
        }
      }
    }
