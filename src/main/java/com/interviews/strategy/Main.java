package com.interviews.strategy;

import java.math.BigDecimal;

public final class Main {
    
    public static void main(String[] args) {
        PaymentContext payment = new PaymentContext(new BigDecimal(10));
        payment.processPayment(new CreditPayment());
        payment.processPayment(new DebitPayment());
    }
}
