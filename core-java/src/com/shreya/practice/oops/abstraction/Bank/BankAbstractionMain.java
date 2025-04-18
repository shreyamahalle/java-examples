package com.shreya.practice.oops.abstraction.Bank;

import com.shreya.practice.oops.abstraction.Bank.service.SBIBankService;

public class BankAbstractionMain {
    public static void main(String[] args) {
        SBIBankService sbiBankService = new SBIBankService();
        sbiBankService.openAccount();
        sbiBankService.disburseLoan();
    }
}
