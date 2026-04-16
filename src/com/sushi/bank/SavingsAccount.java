package com.sushi.bank;

public class SavingsAccount extends Account{

    public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited: " + amount);
    }

    @Override
    void withdraw(double amount) {
        if(amount <= getBalance()){
            setBalance(getBalance() - amount);
            System.out.println("Withdrew: "+ amount);
        }else {
            System.out.println("Insufficient Balance");
        }
    }
}
