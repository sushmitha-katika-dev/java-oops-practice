package com.sushi.ecommerce;

import com.sushi.ecommerce.Payment;
import com.sushi.ecommerce.UpiPayment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart();

        cart.addProducts(new Electronics(1, "Laptop", 50000, "Lenovo"));
        cart.addProducts(new Clothing(2, "T-Shirt", 1000, "M"));

        /*double total = cart.getTotal();

        //Discount
        Discount discount = new FestivalDiscount();

        //Payment
        Payment payment = new UpiPayment();

        OrderService orderService = new OrderService(payment,discount);
        orderService.placeOrder(cart);*/

        // ---------------- DISCOUNT ----------------
        System.out.println("\nChoose Discount:");
        System.out.println("1. No Discount");
        System.out.println("2. Festival Discount (10%)");
        System.out.println("3. Premium Discount (20%)");

        Scanner scanner = new Scanner(System.in);
        int dChoice = scanner.nextInt();

        Discount discount;

        switch (dChoice) {
            case 1:
                discount = new NoDiscount();
                break;
            case 2:
                discount = new FestivalDiscount();
                break;
            case 3:
                discount = new PremiumDiscount();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        // ---------------- PAYMENT ----------------
        System.out.println("\nChoose Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Card");

        int pChoice = scanner.nextInt();

        Payment payment;

        switch (pChoice) {
            case 1:
                payment = new UpiPayment();
                break;
            case 2:
                payment = new CardPayment();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        // ---------------- SUMMARY ----------------
        double total = cart.getTotal();
        double finalAmount = discount.apply(total);

        System.out.println("\n------ ORDER SUMMARY ------");
        cart.displayCart();
        System.out.println("Total: " + total);
        System.out.println("Final Amount: " + finalAmount);
        System.out.println("---------------------------");

        // ---------------- CONFIRM ----------------
        System.out.println("Confirm Order? (yes/no)");
        String confirm = scanner.next();

        if (confirm.equalsIgnoreCase("yes")) {
            OrderService service = new OrderService(payment, discount);
            service.placeOrder(cart);
        } else {
            System.out.println("Order Cancelled");
        }

        scanner.close();

    }
}
