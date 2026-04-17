package com.sushi.food;

public class Swiggy implements DeliveryPartner{

    @Override
    public void deliver(String location) {
        System.out.println("Swiggy delivering to " + location);
    }
}
