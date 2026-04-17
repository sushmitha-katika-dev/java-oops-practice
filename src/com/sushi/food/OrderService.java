package com.sushi.food;

public class OrderService {
    Payment payment;
    DeliveryPartner deliveryPartner;

    public OrderService(Payment payment, DeliveryPartner deliveryPartner) {
        this.payment = payment;
        this.deliveryPartner = deliveryPartner;
    }

    public void processOrder(String location, double amount){
        System.out.println("Processing order...");
        deliveryPartner.deliver(location);
        if(payment.pay(amount)){
            System.out.println("Order processed successfully");
        }else {
            System.out.println("Payment failed");
        }
    }
}
