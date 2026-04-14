package com.sushi.vehicle;

public class Vehicle {
    int id;
    String brand;
    int speed;
    int maxSpeed;

    public Vehicle(int id, String brand, int speed) {
        this.id = id;
        this.brand = brand;
        this.speed = speed;
    }

    void start(){
        System.out.println("Vehicle is starting..");
    }

    void stop(){
        System.out.println("Vehicle is stopping..");
    }

    void fuelType(){

    }
    void checkSpeed(){
        if(speed > maxSpeed) {
            System.out.println("Overspeeding!!, Speed: " + speed);
        }else {
            System.out.println("Speed is safe, Speed: " + speed);
        }
    }
    void honk() {
        System.out.println("Vehicle honking...");
    }
    void gearType() {
        System.out.println("Generic gear system");
    }
}
