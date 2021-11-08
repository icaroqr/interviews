package com.interviews.hexacta.questionTest1;
/**
 * A classe {@code MenorInt} possui métodos que auxiliam na busca dentro de uma lista de números inteiros,
 * pelo menor número inteiro que não existe dentro dela
 * @author  Icaro Rezende
 **/
public class MenorInt {

    /**
     * Método recursivo que recebe uma lista de números inteiros e executa regras necessárias
     * para retornar o menor número inteiro que não existe dentro dela 
     * @param   lista   lista de números inteiros
     * @return  menor número inteiro não existente na lista {@code lista} recebida
     */
    public int solucao(int[] lista) {
        //Encontra o menor inteiro da colecao
        int menorEncontrado = retornaMenorInteiroDaLista(lista);
        int proximoInteiro = menorEncontrado + 1;
            //Verifica se o proximo inteiro existe na colecao
            if(isNumeroNaLista(proximoInteiro,lista) && lista != null){
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
    
    /**
     * Método que retorna o menor número inteiro de uma lista de números inteiros
     * @param   lista   lista de números inteiros
     * @return  menor número inteiro da lista {@code lista} recebida
     */
    private int retornaMenorInteiroDaLista (int[] lista) {
	    int menorNumero=lista[0];
	    for(int i=0; i<lista.length; i++){
	        if(lista[i] < menorNumero){
	            menorNumero = lista[i];
	        }
	    }
	    return menorNumero;
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
    
    /**
     * Método que recebe uma lista e um número para ser retirado dela, retornando uma cópia da lista sem o número
     * recebido por parâmetro
     * @param   numero   numero que deseja retirar
     * @param   lista   lista de números inteiros de onde o número será retirado
     * @return  retorna uma cópia da lista {@code lista} sem o número recebido {@code numero}
     */
     private int[] retiraNumeroDaLista(int numero, int[] lista){
        //Encontra quantas vezes o numero aparece na lista
        int nuOcorrenciasNumero = 0;
        for(int i=0; i<lista.length; i++){
	        if(lista[i] == numero){
               nuOcorrenciasNumero++;
	        }
	    }
        //Cria novo array baseado na ocorrencia do numero e faz uma cópia
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
