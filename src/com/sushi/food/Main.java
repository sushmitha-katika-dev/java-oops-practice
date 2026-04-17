/*
    DeliveryPartner → Swiggy / Zomato / Dunzo
    Payment → UPI / Card
    OrderService → connects both
 */

package com.sushi.food;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DeliveryPartner deliveryPartner = null;
        Payment payment = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ur choice");
        System.out.println("1. Zomato 2. Swiggy 3. Dunzo");
        int dchoice = scanner.nextInt();
        switch (dchoice){
            case 1:
                deliveryPartner = new Zomato();
                break;
            case 2:
                deliveryPartner = new Swiggy();
                break;
            case 3:
                deliveryPartner = new Dunzo();
                break;
            default:
                System.out.println("Invalid option");
                return;
        }

        System.out.println("Enter ur choice");
        System.out.println("\n1. UPI Payment\n 2. Card Payment");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                payment = new UpiPayment();
                break;
            case 2:
                payment = new CardPayment();
                break;
            default:
                System.out.println("Invalid option");
                return;
        }

        OrderService orderService = new OrderService(payment, deliveryPartner);
        orderService.processOrder("Spain", 2000);

        scanner.close();

    }
}
