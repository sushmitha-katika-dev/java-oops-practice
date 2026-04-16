package com.sushi.ecommerce;

public class PremiumDiscount implements Discount{

    // Assume premium Discount = 30%
    @Override
    public double apply(double amount) {
        double discount = amount * 0.30;
        return amount - discount;
    }
}
