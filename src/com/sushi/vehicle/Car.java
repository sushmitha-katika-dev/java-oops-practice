package com.sushi.vehicle;

public class Car extends Vehicle{

    public Car(int id, String brand, int speed) {
        super(id, brand, speed);
        this.maxSpeed = 120;
    }

    @Override
    void start(){
        System.out.println("Car starts..");
    }

    @Override
    void stop() {
        System.out.println("Car stops");
    }

    @Override
    void fuelType() {
        System.out.println("Car fuel: Diesel/petrol");
    }

    @Override
    void honk() {
        System.out.println("Car horn: Beep Beep!");
    }
    void gearType() {
        System.out.println("Car gear: Automatic gear");
    }
}
