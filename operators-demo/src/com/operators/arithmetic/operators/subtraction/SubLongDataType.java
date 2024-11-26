package com.operators.arithmetic.operators.subtraction;

public class SubLongDataType {

        public void subtract(){
        /*
        pseudocode(Steps)
        two variables.
        perform sub
        print the output
         */
            long n1 = 45535434;
            long n2 = 854543344;
            System.out.println("Subtraction is " + (n1 - n2 ));
        }

        public static void main(String[] args) {
            SubLongDataType sb = new SubLongDataType();
            sb.subtract();
        }
    }
