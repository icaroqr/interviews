package com.interviews.hexacta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

import com.interviews.hexacta.questionCall3.Fatorial;
import com.interviews.hexacta.questionTest1.MenorInt;
import com.interviews.hexacta.questionTest2.Combinacoes;
import com.interviews.hexacta.questionTest3.Exponencial;
import com.interviews.hexacta.questionTest4.Intersecao;

/**
 * A classe {@code App} é a classe principal que deve ser executada pra visualizar os resultados
 * das questões da prova da Hexacta
 * @author  Icaro Rezende
 **/
public class App 
{
    public static void main( String[] args )
    {
        //Questão 3 da entrevista Hexacta, retorna o resultado fatorial de um número qualquer
        Fatorial fatorialClass = new Fatorial();
        System.out.println("Fatorial do número 5 é: " + fatorialClass.fatorial(5));

        //Questão 1 da prova Hexacta, retorna o menor inteiro não existente em uma lista
        MenorInt menorIntClass = new MenorInt();
        int[] lista = {1, 3, 6, 4, 1, 2};
        System.out.println("O menor proximo inteiro da lista é: " + menorIntClass.solucao(lista));

        //Questão 2 da prova Hexacta, retorna as combinacoes que somadas são iguais a 8
        Combinacoes combinacoes = new Combinacoes();
        List<Integer> array = new ArrayList<>(Arrays.asList(-2, -1, 0, 2, 4, 7, 8, 9, 9));
        int soma = 8;
        System.out.println("Combinacoes para a soma de 8 é: " + combinacoes.retornaCombinacoes(array,soma).toString());

        //Questão 3 da prova Hexacta, retorna o valor exponencial de um numero
        Exponencial exponencial = new Exponencial();
        int expoente = 1000;
        double base = 0.999999999999D;
        System.out.println("O valor de potência dos numeros é: " + exponencial.calcPM(expoente, base));
        System.out.println("O valor de potência (usando pow) dos numeros é: " + exponencial.calcPMComPow(expoente, base));

        //Questão 4 da prova Hexacta, melhora a forma de retornar uma interseção de números
        Intersecao intersecao = new Intersecao();
        //Gera listas grandes para testes
        int[] listaA = new int[30000];
        int[] listaB = new int[15000];
        for (int i = 0; i < 30000; i++) {
            listaA[i] = i;
        }
        for (int i = 0; i < 15000; i++) {
            listaB[i] = i;
        }
        //Testa e calcula tempo do modo antigo
        System.out.println("Iniciando intersect antigo..");
        long tempoInicial = System.currentTimeMillis();
        intersecao.printIntersectionAntiga(listaA, listaB);
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Finalizado intersect antigo em: ");
        System.out.printf("%.3f segundos%n", (tempoFinal - tempoInicial) / 1000d);

        //Testa e calcula tempo do modo novo
        System.out.println("Iniciando intersect novo..");
        tempoInicial = System.currentTimeMillis();
        intersecao.printIntersectionNova(listaA, listaB);
        tempoFinal = System.currentTimeMillis();
        System.out.println("Finalizado intersect novo em: ");
        System.out.printf("%.3f segundos%n", (tempoFinal - tempoInicial) / 1000d);

        PriorityQueue<String> p = new PriorityQueue<String>();
        p.add("dishes");
        p.add("laundry");
        p.add("bills");
        p.offer("bills");
        System.out.print(p.size() + " " + p.poll());
        System.out.print(" " + p.peek() + " " + p.poll());
        System.out.println(" " + p.poll() + " " + p.poll());

        int[] arr = {1};
        call(arr[0], arr);
        System.out.println(arr[0] + "," + arr[1]);

    
    }
    static void call(int i, int [] arr){
        arr[i] = 6;
        i = 5;
    }
}
