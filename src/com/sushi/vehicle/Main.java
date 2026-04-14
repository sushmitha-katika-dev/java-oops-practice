package com.sushi.vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleService();

        Vehicle vehicle1 = new Car(1, "toyota", 120);
        Vehicle vehicle2 = new Bike(2, "R15", 100);
        Vehicle vehicle3 = new Truck(3, "TATA",60);
        Vehicle vehicle4 = new ElectricCar(4, "Tesla",140, 80);

        vehicleService.testDrive(vehicle1);
        vehicleService.testDrive(vehicle2);
        vehicleService.testDrive(vehicle3);
        vehicleService.testDrive(vehicle4);
    }
}
