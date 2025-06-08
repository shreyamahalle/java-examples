package com.shreya.practice.oops.interfacee.interest;

public class CompoundInterest extends SimpleInterest {

    public  double calculate(double interestRate , int principalAmt, int years){
        return principalAmt * Math.pow(1.0 + interestRate/100.0, years) - principalAmt;
    }
    public double calculate(double interfaceRate, int principalAmt) {
        return  principalAmt * Math.pow(1.0 + interfaceRate/100.0,1) - principalAmt;
    }
}
