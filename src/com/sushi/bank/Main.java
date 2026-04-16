/*
🏦 Banking Application - Overview

This application simulates how a real banking system processes transactions.

👉 What it is:
A simple system that connects:

* Account (Savings / Current)
* Payment method (UPI / Card)
* Service layer (BankService)

👉 How it works:

1. User selects account type and payment method
2. Payment module validates the transaction
3. BankService coordinates the process
4. Account withdraws the amount if payment is successful
5. Updated balance is displayed

👉 Where it is used in real life:
This design is used in applications like:

* Google Pay
* PhonePe
* Paytm
* Online banking systems

👉 Key Concepts Used:

* Encapsulation → protects account data
* Abstraction → defines account behavior
* Interface → supports multiple payment methods
* Polymorphism → allows dynamic selection at runtime
* Loose Coupling → independent modules working together

👉 Summary:
BankService acts as the central controller that connects account and payment modules
to complete a transaction in a flexible and scalable way.
*/


package com.sushi.bank;

import javax.smartcardio.Card;
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