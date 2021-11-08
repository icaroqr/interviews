package com.interviews.hexacta.questionTest3;

import java.text.DecimalFormat;

public class Exponencial {
    
    public String calcPMComPow(int expoente, double base) {
        DecimalFormat df = new DecimalFormat("0.00000000000");
        return df.format(Math.pow(base, expoente));
    }

    public double calcPM(int expoente, double base) {
        double potencia = base;
        if(expoente == 0){
            potencia = 1;
        }else{
            while(expoente > 1){
                potencia = potencia * base;
                expoente--; 
            }
        }
        return potencia;
    }
}
