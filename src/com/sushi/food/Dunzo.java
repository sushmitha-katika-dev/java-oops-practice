package com.sushi.food;

public class Dunzo implements DeliveryPartner{
    @Override
    public void deliver(String location) {
        System.out.println("Dunzo deleivering to " + location);
    }
}
