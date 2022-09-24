package com.interviews.strategy;

import java.math.BigDecimal;

public class CreditPayment implements PaymenyStrategy{

    @Override
    public void processPayment(BigDecimal value) {
        System.out.println("paying with credit card");
    }
    
}
