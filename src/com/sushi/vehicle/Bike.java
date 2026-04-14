package com.sushi.vehicle;

public class Bike extends Vehicle{

    public Bike(int id, String brand, int speed) {
        super(id, brand, speed);
        this.maxSpeed = 100;
    }

    @Override
    void start() {
        System.out.println("Bike starts with kick or self-start");
    }

    @Override
    void stop() {
        System.out.println("Bike stops");
    }

    @Override
    void fuelType() {
        System.out.println("Bike Fuel: Petrol");
    }

    @Override
    void honk() {
        System.out.println("Bike horn: Peep Peep!");
    }

    void gearType() {
        System.out.println("Bike gear: Manual gear");
    }
}
