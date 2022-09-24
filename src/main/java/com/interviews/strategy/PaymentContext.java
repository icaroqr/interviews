package com.interviews.strategy;

import java.math.BigDecimal;

public class PaymentContext {

    private BigDecimal value;

    public PaymentContext(BigDecimal value){
        this.value = value;
    }

    public void processPayment(PaymenyStrategy paymenyStrategy){
        paymenyStrategy.processPayment(value);
    }
    
}
