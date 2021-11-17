package com.interviews.avenue.warmQuestion;

/**
* A classe {@code Multiple} 
* de um dado número
* @author  Icaro Rezende
**/
public class Multiple {

    public void fizzBuzz(int n) {
            for(int i=1; i<=n; i++){
                String buzz = String.valueOf(i);
                boolean isMultiplo3 = (i % 3) == 0;
                boolean isMultiplo5 = (i % 5) == 0;

                if(isMultiplo3 && !isMultiplo5){
                    buzz = "Fizz";
                }else
                if(isMultiplo5 && !isMultiplo3){
                    buzz = "Buzz";
                }else
                if(isMultiplo5 && isMultiplo3){              
                    buzz = "FizzBuzz";  
                }
                
                System.out.println(buzz);
            }
        }
    
}
