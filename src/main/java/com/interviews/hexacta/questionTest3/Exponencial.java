package com.interviews.hexacta.questionTest3;

import java.text.DecimalFormat;

/**
 * A classe {@code Exponencial} calcula a potência de um número base elevado a um expoente
 * @author  Icaro Rezende
 **/
public class Exponencial {
    
    /**
     * Método que retorna o resultado a potência de um número base de acordo com seu expoente
     * @param   expoente   número de vezes que o número base será multiplicado
     * @param   base   número base que será elevado
     * @return  a potência de um número elevado
     */
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

    /**
     * Método teste que retorna o resultado de Math.pow() apenas para nível de comparação
     * @param   expoente   número de vezes que o número base será multiplicado
     * @param   base   número base que será elevado
     * @return  a potência de um número elevado
     */
    public String calcPMComPow(int expoente, double base) {
        DecimalFormat df = new DecimalFormat("0.00000000000");
        return df.format(Math.pow(base, expoente));
    }
}
