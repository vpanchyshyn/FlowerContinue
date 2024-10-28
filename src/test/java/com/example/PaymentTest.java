package com.example;

import com.example.demo.payment.CreditCardPaymentStrategy;
import com.example.demo.payment.PayPalPaymentStrategy;
import com.example.demo.payment.Payment;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTest {

    @Test
    public void testCreditCardPayment() {
        Payment payment = new CreditCardPaymentStrategy();
        String result = payment.pay();
        assertEquals("Payment with credit card", result, "Credit card payment should return correct message");
    }

    @Test
    public void testPayPalPayment() {
        Payment payment = new PayPalPaymentStrategy();
        String result = payment.pay();
        assertEquals("Payment with PayPal", result, "PayPal payment should return correct message");
    }
}

