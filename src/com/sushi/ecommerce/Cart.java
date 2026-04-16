package com.sushi.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> productsList = new ArrayList<>();

    //Add products to cart
    public void addProducts(Product product){
        productsList.add(product);
        System.out.println(product.getName() + " is added to the cart... ");
    }

    //Display cart
    public void displayCart(){
        System.out.println("\n--- Cart Items ---");
        for(Product product : productsList){
            product.displayDetails();
        }
    }

    //calculate total Price
    public double getTotal(){
        double total = 0;
        for (Product product : productsList){
            total += product.getPrice();
        }
        return total;
    }
}
