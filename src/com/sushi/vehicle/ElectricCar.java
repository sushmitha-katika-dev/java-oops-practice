package com.sushi.vehicle;

public class ElectricCar extends Car{

    int batteryLevel;

    public ElectricCar(int id, String brand, int speed, int batteryLevel) {
        super(id, brand, speed);
        this.batteryLevel = batteryLevel;
    }

    @Override
    void start() {
        System.out.println("Electric car starts silently...");
    }

    void chargeBattery() {
        System.out.println("Battery Level: " + batteryLevel + "%");
    }

    @Override
    void fuelType(){
        System.out.println("Electric car fuel: Electric");
    }
}
