package com.sushi.ecommerce;

public class CardPayment implements Payment {

    @Override
    public boolean pay(double amount) {
        System.out.println("Payment successful using Card: " + amount);
        return true;
    }
}