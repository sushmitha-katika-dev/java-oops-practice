package com.sushi.ecommerce;

public class OrderService {

    private Payment payment;
    private Discount discount;

    public OrderService(Payment payment, Discount discount) {
        this.payment = payment;
        this.discount = discount;
    }

    public void placeOrder(Cart cart){
        // 1. calculate total
        double total = cart.getTotal();
        System.out.println("\nTotal Amount: " + total);

        // 2. Apply Discount
        double finalAmount = discount.apply(total);
        System.out.println("After Discount: " + finalAmount +"\n");

        // 3. ProcessPayment
        if(payment.pay(finalAmount)){
            System.out.println("Order Successfully placed");
        } else {
            System.out.println("Payment failed");
        }
    }
}
