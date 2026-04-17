package com.sushi.food;

public class UpiPayment implements Payment{
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment done using UPI: " + amount);
        return true;
    }
}
