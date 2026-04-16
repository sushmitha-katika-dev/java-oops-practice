package com.sushi.ecommerce;

public class FestivalDiscount implements Discount{
    //Let assume festival discount = 25%
    @Override
    public double apply(double amount) {
        double discount = amount * 0.25;
        return amount - discount;
    }
}
