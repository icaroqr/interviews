package com.interviews.hexacta.questionCall3;

public class Fatorial {

    public int fatorial(int numero) {
        int resultado = numero;
        if(numero > 0){
            while (numero > 1){
                resultado = resultado * (numero - 1);
                numero--;
                }
        }else{
            resultado = 1;
        }
        return resultado;
        }
    
}
