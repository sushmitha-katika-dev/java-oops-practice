package com.sushi.ecommerce;

public class Clothing extends Product{

    private String size;

    public Clothing(int id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    @Override
    public void displayDetails() {
        System.out.println("Clothing: " + getName() + " | Size: " + size + " | Price: " + getPrice());
    }
}
