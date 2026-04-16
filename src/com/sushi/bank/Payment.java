package com.sushi.bank;

public interface Payment {

    boolean pay(double amount);

    default void validatePayment(){
        System.out.println("Payment validated");
    }
}
