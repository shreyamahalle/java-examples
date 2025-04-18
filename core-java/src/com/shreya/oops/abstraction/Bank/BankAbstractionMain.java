package src.com.shreya.oops.abstraction.Bank;

import src.com.shreya.oops.abstraction.Bank.service.SBIBankService;

public class BankAbstractionMain {
    public static void main(String[] args) {
        SBIBankService sbiBankService = new SBIBankService();
        sbiBankService.openAccount();
        sbiBankService.disburseLoan();
    }
}
