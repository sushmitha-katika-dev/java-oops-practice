package com.sushi.vehicle;

public class Truck extends Vehicle{

    public Truck(int id, String brand, int speed) {
        super(id, brand, speed);
        this.maxSpeed = 80;
    }

    @Override
    void start() {
        System.out.println("Truck Starts");
    }

    @Override
    void stop() {
        System.out.println("Truck stops");
    }

    @Override
    void fuelType() {
        System.out.println("Truck fuel: Diesel");
    }

    @Override
    void honk() {
        System.out.println("Truck horn: HONK HONK!");
    }

    void gearType() {
        System.out.println("Truck gear: Heavy manual gear");
    }

}
