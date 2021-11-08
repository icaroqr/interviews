package com.interviews.hexacta.questionTest4;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * A classe {@code Intersecao} retorna os valores inteiros existentes em duas listas
 * @author  Icaro Rezende
 **/
public class Intersecao {
    
     /**
     * Método que retorna os valores inteiros existentes em duas listas através de um while para se evitar comparações de todas as possibilidades
     * das duas listas
     * @param   setA   primeira lista de números inteiros a ser iterada
     * @param   setB   segunda lista de números inteiros a ser iterada
     * @return  números inteiros que foram encontrados nas duas listas recebidas
     */
    public void printIntersectionNova(int[] setA, int[] setB) {
        if (setA != null && setB != null) {
            Arrays.sort(setA);
            Arrays.sort(setB);
            ArrayList<Integer> commonSet = new ArrayList<Integer>();
            
            int i = 0;
            int j = 0; 
            while (i != setA.length && j != setB.length) { 
                if (setA[i] < setB[j]) {
                    i++;
                } else if (setA[i] > setB[j]) { 
                    j++;
                } else { 
                    commonSet.add(setA[i]); 
                    i++;
                    j++;
                }
            }
        }
    }

    /**
     * Método que deve ser melhorado para encontrar inteiros que existam em duas listas
     */
    public void printIntersectionAntiga(int[] setA, int[] setB) {
        if (setA != null && setB != null) {
            Arrays.sort(setA);
            Arrays.sort(setB);
            ArrayList<Integer> commonSet = new ArrayList<Integer>();
    
            for (int i = 0; i < setA.length; i++) {
                for (int j = 0; j < setB.length; j++) {
                    if (setA[i] == setB[j] && !commonSet.contains(setA[i])) {
                        commonSet.add(setA[i]);
                    }
                }
            }
        }
    }
}
