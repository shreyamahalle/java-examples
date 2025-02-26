package src.com.practice.oops.abstraction.Bank.service;

public class SBIBankService extends BankService{

    @Override
    public void disburseLoan() {
        System.out.println("Loan is being disbursed is SBI style ...");
    }
    public void openAccount(){
        System.out.println("Account open by SBI bank");
    }
}
