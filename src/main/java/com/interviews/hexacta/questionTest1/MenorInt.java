package com.interviews.hexacta.questionTest1;

import java.util.Arrays;

/**
 * A classe {@code MenorInt} possui métodos que auxiliam na busca dentro de uma lista de números inteiros,
 * pelo menor número inteiro que não existe dentro dela
 * @author  Icaro Rezende
 **/
public class MenorInt {

    /**
     * Método que recebe uma lista de números inteiros, ordena de forma ascendente e itera a mesma
     * para retornar o menor número inteiro que não existe dentro dela 
     * @param   lista   lista de números inteiros
     * @return  menor número inteiro não existente na lista {@code lista} recebida
     */
    public int solucao(int[] lista){
        Arrays.sort(lista);
        for(int i = 0; i < lista.length; i++){
            int proximo = lista[i] + 1;
                if(!isNumeroNaLista(proximo, lista)){
                    if(proximo < 0){
                        return 1;
                    }else{
                        return proximo;
                    }
                }
        }
        return 0;
    }
    
    /**
     * Método que verifica se um número está presente em uma lista de inteiros
     * @param   numero   numero que deseja encontrar
     * @param   lista   lista de números inteiros que será iterada
     * @return  true se o número {@code numero} existe ou false se não foi encontrado na lista {@code lista} recebida
     */
    private boolean isNumeroNaLista(int numero, int[] lista){
        for(int i=0; i<lista.length; i++){
	        if(lista[i] == numero){
	            return true;
	        }
	    }
	    return false;
    }
    
}
