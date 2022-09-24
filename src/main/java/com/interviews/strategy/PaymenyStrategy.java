package com.interviews.strategy;

import java.math.BigDecimal;

public interface PaymenyStrategy {

    void processPayment(BigDecimal value);
    
}
