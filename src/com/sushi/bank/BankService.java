package com.sushi.bank;

public class BankService {

    private final Account account;
    private final Payment payment;

    public BankService(Account account, Payment payment) {
        this.account = account;
        this.payment = payment;
    }

    public void processPayment(double amount) {
        if(payment.pay(amount)){
            account.withdraw(amount);
            System.out.println("Transaction successful..");
        }else {
            System.out.println("Transaction failed..");
        }
    }
}
