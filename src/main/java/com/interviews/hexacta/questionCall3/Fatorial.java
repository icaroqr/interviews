package com.interviews.hexacta.questionCall3;

/**
 * A classe {@code Fatorial} realiza cálculos matemáticos básicos para encontrar o fatorial
 * de um dado número
 * @author  Icaro Rezende
 **/
public class Fatorial {

     /**
     * Recebe um número do tipo int e retorna o valor fatorial desse mesmo número
     * @param   numero   um número inteiro
     * @return  o fatorial de um número {@code numero} no tipo primitivo int
     */
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
