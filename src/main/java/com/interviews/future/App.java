package com.interviews.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class App {
    
    public static void main(String[] args){
        try {
        Future<Integer> future = new SquareCalculator().calculate(10);

        while(!future.isDone()) {
            System.out.println("Calculating...");
            Thread.sleep(300);            
        }
        
        Integer result = future.get();
        System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

 
}
