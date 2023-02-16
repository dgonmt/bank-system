package se.iths.service.impl;

import se.iths.BankAccount;
import se.iths.service.BankService;

public class BankServiceImpl implements BankService {
    @Override
    public void withdraw(BankAccount bankAccount, double amount) {
        if (amount != 0 && bankAccount.getBalance() >= amount) {
            bankAccount.setBalance(bankAccount.getBalance() - amount);
            bankAccount.setPrevTrans(bankAccount.getPrevTrans() - amount);
        } else if (bankAccount.getBalance() < amount) {
            System.out.println("Bank balance insufficient");
        }
    }

    @Override
    public void deposit(BankAccount bankAccount, double amount) {
        if (amount != 0) {
            bankAccount.setBalance(bankAccount.getBalance() + amount);
            bankAccount.setPrevTrans(amount);
        }
    }
}
