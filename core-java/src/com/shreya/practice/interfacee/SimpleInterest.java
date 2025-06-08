package com.shreya.practice.interfacee;

public class SimpleInterest implements  Interest{
    @Override
    public double calculate(double interfaceRate, int principalAmt, int years) {
        return principalAmt * (interfaceRate/100) * years;
    }

    @Override
    public double calculate(double interfaceRate, int principalAmt) {
        return principalAmt * (interfaceRate/100);
    }
}
