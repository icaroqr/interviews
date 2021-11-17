package com.interviews.avenue;

import com.interviews.avenue.warmQuestion.Multiple;

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
    }
}
