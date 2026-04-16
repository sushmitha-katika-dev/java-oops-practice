package com.sushi.ecommerce;

public class Electronics extends Product{

    private String brand;

    public Electronics(int id, String name, double price, String brand) {
        super(id, name, price);
        this.brand = brand;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics: " + getName() + " | Brand: " + brand + " | Price: " + getPrice());
    }
}
