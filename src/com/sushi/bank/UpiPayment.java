package com.sushi.bank;

public class UpiPayment implements Payment{

    @Override
    public boolean pay(double amount) {
        validatePayment();
        System.out.println("Payment done using UPI: " + amount);
        return true;
    }
}
