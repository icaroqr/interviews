package com.interviews.hexacta.questionTest3;

import java.text.DecimalFormat;

public class Exoponecial {
    
    public String calcPMComPow(int expoente, double base) {
        DecimalFormat df = new DecimalFormat("0.00000000000");
        return df.format(Math.pow(base, expoente));
    }

    public double calcPM(int expoente, double base) {
        return Math.pow(base, expoente);
    }
}
