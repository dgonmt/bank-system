package se.iths.service;

import se.iths.BankAccount;

public interface BankService {
    void withdraw(final BankAccount bankAccount, final double amount);

    void deposit(final BankAccount bankAccount, double amount);

}
