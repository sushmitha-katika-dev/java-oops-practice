package com.sushi.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. UPI Payment");
        System.out.println("2. Card Payment");
        System.out.println("Enter the option");
        int choice = scanner.nextInt();

        System.out.println("1. Saving Account");
        System.out.println("2. Current Account");
        System.out.println("Enter the option");
        int choice2 = scanner.nextInt();

        Account account;
        Payment payment;

        //Select Account
        switch (choice2) {
            case 1:
                account = new SavingsAccount(123, "Sushmitha", 2000);
                break;
            case 2:
                account = new CurrentAccount(456, "Manohar", 3000);
                break;
            default:
                System.out.println("Invalid account option");
                return;
        }
        // Select Payment
        switch (choice) {
            case 1:
                payment = new UpiPayment();
                break;
            case 2:
                payment = new CardPayment();
                break;
            default:
                System.out.println("Invalid payment option");
                return;
        }
        BankService service = new BankService(account, payment);

        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();

        service.processPayment(amount);

        account.displayDetails();

    }
}

/*
        FLOW (REAL WORLD)

        You click Pay
           ↓
        Payment verifies (UPI/Card)
           ↓
        Bank checks account balance
           ↓
        Money deducted
           ↓
        Transaction success

*/

/*

    In real systems, service layer coordinates between payment and account modules
    to process transactions while keeping them loosely coupled
 */