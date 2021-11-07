package com.interviews.hexacta.questionTest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinacoes {
    
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

    private boolean isCombinacaoNova(List<Integer> novaCombinacao, List<List<Integer>> listaCombinacoes) {
        for (List<Integer> list : listaCombinacoes) {
            if(list.equals(novaCombinacao)){
                return false;
            }
        }
        return true;
    }
}
