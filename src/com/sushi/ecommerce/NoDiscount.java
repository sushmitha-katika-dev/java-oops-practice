package com.sushi.ecommerce;

public class NoDiscount implements Discount{

    @Override
    public double apply(double amount) {
        return amount;
    }
}
