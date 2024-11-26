package com.operators.arithmetic.operators.subtraction;

public class SubDoubleDataType {
    public void subtract() {
        /*
        pseudocode(Steps)
        two variables.
        perform sub
        print the output
         */
        double n1 = 45535434.4567;
        double n2 = 854543344.76;
        System.out.println("Subtraction is " + (n1 - n2));
    }

    public static void main(String[] args) {
        SubDoubleDataType sb = new SubDoubleDataType();
        sb.subtract();
    }
}
