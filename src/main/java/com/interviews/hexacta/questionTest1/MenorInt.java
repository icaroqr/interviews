package com.interviews.hexacta.questionTest1;

public class MenorInt {

    public int solucao(int[] lista) {
        //Encontra o menor inteiro da colecao
        int menorEncontrado = retornaMenorInteiroDaLista(lista);
        int proximoInteiro = menorEncontrado + 1;
            //Verifica se o proximo inteiro existe na colecao
            if(isProxNumeroNaLista(proximoInteiro,lista) && lista != null){
                //Se existe, retira o numero e chama a mesma função recursivamente
                lista = retiraNumeroDaLista(menorEncontrado,lista);
                return solucao(lista);
            }else{
                //Se não existe, nula a lista como condição de parada e retorna o valor encontrado
                lista = null;
                if(proximoInteiro < 0){
                    proximoInteiro = 1;
                }
                return proximoInteiro;
            }
    }
    
    private int retornaMenorInteiroDaLista (int[] lista) {
	    int menorNumero=lista[0];
	    for(int i=0; i<lista.length; i++){
	        if(lista[i] < menorNumero){
	            menorNumero = lista[i];
	        }
	    }
	    return menorNumero;
    }
    
    private boolean isProxNumeroNaLista(int numero, int[] lista){
        for(int i=0; i<lista.length; i++){
	        if(lista[i] == numero){
	            return true;
	        }
	    }
	    return false;
    }
    
     private int[] retiraNumeroDaLista(int numero, int[] lista){
        //Encontra quantas vezes o numero aparece na lista
        int nuOcorrenciasNumero = 0;
        for(int i=0; i<lista.length; i++){
	        if(lista[i] == numero){
               nuOcorrenciasNumero++;
	        }
	    }
        //Cria novo array baseado na ocorrencia do numero e faz a copia
        int indexNovo = 0;
        int[] listaNova = new int[lista.length - nuOcorrenciasNumero];
        for(int i=0; i<lista.length; i++){
	        if(lista[i] != numero){
	            listaNova[indexNovo] = lista[i];
                indexNovo++;
	        }
	    }
        return listaNova;
    }
    
}
