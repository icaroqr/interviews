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
    public int solucao(int[] lista) {
        Arrays.sort(lista);
        for (int i = 0; i < lista.length; i++) {
            if(lista[i] > i) {
                return i;
            }
        }
        return lista.length;
    }
}
