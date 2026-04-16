package com.sushi.ecommerce;

public class UpiPayment implements Payment {

    @Override
    public boolean pay(double amount) {
        System.out.println("Payment successful using UPI: " + amount);
        return true;
    }
}