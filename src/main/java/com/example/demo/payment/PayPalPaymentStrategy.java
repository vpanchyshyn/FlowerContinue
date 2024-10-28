package com.example.demo.payment;

public class PayPalPaymentStrategy implements Payment {
    public String pay() {
        return "Payment with PayPal";
    }

}
