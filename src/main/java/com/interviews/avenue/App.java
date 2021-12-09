package com.interviews.avenue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.interviews.avenue.warmQuestion.Multiple;

// import com.interviews.avenue.warmQuestion.Multiple;

/**
 * A classe {@code App} é a classe principal que deve ser executada pra visualizar os resultados
 * das questões da prova da Avenue
 * @author  Icaro Rezende
 **/
public class App 
{
    public static void main( String[] args )
    {
        Multiple m = new Multiple();
        m.fizzBuzz(15);
        List<String> lista = Arrays.asList("a","b","c","d");
        List<Integer> listaInt = Arrays.asList(1,4,5,6,7);
        lista.stream()
                .map((e) -> e += "1")
                .forEach((n) -> System.out.println(n) );
        System.out.println(lista);

        Optional<Integer> menorInt = listaInt.stream().min(Comparator.naturalOrder());
        System.out.println(menorInt.get());

        Map<Boolean, List<String>> lista2 = lista.stream().collect(Collectors.groupingBy(e -> e.equals("a")));
        System.out.println(lista2);

       //  List<String> listRevertida = lista.stream().sorted().collect(Collections.reverseOrder());
        List<Integer> list = Arrays.asList(3,44);
        String str = list.stream()
                         .map(i -> i % 2 == 0 ? "e"+i.toString() : "o"+i.toString())
                         .collect(Collectors.joining(","));
        System.out.println(str);


        System.out.println(lista.stream().reduce((s1, s2)-> s1 + s2).orElse(""));
    }
}
