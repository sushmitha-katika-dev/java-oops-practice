package com.sushi.food;

public class Zomato implements DeliveryPartner{
    @Override
    public void deliver(String location) {
        System.out.println("Zomato delivering to " + location);
    }
}
