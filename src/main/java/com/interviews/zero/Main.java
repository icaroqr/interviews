package com.interviews.zero;

public class Main {

    public static void main(String[] args){
        int[] list = {500,-2,4,-3,-10,13,2};

        int closestIndex = 0;
        int tempInt = Integer.MAX_VALUE;

        for (int i = 0; i < list.length; i++) {
            int absValue = Math.abs(list[i]);
            if(absValue < tempInt){
                tempInt = absValue;
                closestIndex = i;
            
             }else if(absValue == tempInt && absValue > 0 && list[closestIndex] < 0){
                //Mesma distancia do zero mas positivo, caso seja o mesmo numero e o index armazenado era do negativo, pega o positivo
                closestIndex = i;
            }
        }
        System.out.println("Next to zero is: " + list[closestIndex]);

    }
    
}
