package com.sushi.food;

public class CardPayment implements Payment{
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment done using Card: " + amount);
        return true;
    }
}
