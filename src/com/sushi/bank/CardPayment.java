package com.sushi.bank;

public class CardPayment implements Payment{

    @Override
    public boolean pay(double amount) {
        validatePayment();
        System.out.println("Payment done using Card: " + amount);
        return true;
    }
}
