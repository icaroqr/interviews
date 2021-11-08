package com.interviews.hexacta.questionTest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A classe {@code Combinacoes} possui métodos que agrupam combinações de inteiros de acordo com resultado da soma dos mesmos
 * @author  Icaro Rezende
 **/
public class Combinacoes {
    
     /**
     * Recebe uma lista de Inteiros e agrupa os inteiros que somados são iguais ao resultado recebido por parâmetro
     * @param   lista lista de inteiros
     * @param   resultadoSoma resultado da soma que será comparada
     * @return  lista {@code lista} de objetos inteiros agrupados por aqueles que somados são iguais ao resultado da soma recebido {@code resultadoSoma}
     */
    public List<List<Integer>> retornaCombinacoes(List<Integer> lista, Integer resultadoSoma){
        List<List<Integer>> listaCombinacoes = new ArrayList<List<Integer>>();
        for (Integer integer1 : lista) {
            for (Integer integer2 : lista) {
                if(integer1 + integer2 == resultadoSoma){
                    List<Integer> novaCombinacao = new ArrayList<>(Arrays.asList(integer1,integer2));
                    if(isCombinacaoNova(novaCombinacao,listaCombinacoes)){
                        listaCombinacoes.add(novaCombinacao);
                    }
                }
            }
        }
        return listaCombinacoes;
    }

    /**
     * Compara um objeto List de Inteiros dentro de uma lista de objetos List de inteiros e retorna true se não existir
     * @param   novaCombinacao objeto List de inteiros
     * @param   listaCombinacoes lista de objetos List de inteiros
     * @return  true caso o objeto List não foi encontrado na lista, se encontrado retorna false
     */
    private boolean isCombinacaoNova(List<Integer> novaCombinacao, List<List<Integer>> listaCombinacoes) {
        for (List<Integer> list : listaCombinacoes) {
            if(list.equals(novaCombinacao)){
                return false;
            }
        }
        return true;
    }
}
