package com.example.demo.payment;

public class CreditCardPaymentStrategy implements Payment {
    public String pay() {
        return "Payment with credit card";
    }

}
