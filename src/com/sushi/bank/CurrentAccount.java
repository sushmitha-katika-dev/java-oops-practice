package com.sushi.bank;

public class CurrentAccount extends Account{

    public CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited: " + amount);
    }

    @Override
    void withdraw(double amount) {
        setBalance(getBalance() - amount);
        System.out.println("Withdrew: " + amount);
    }
}
