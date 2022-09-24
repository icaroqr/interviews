package com.interviews.sortInsertion;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        int[] list = {1,32,321,42,2,15,52,5121,2,5};
        list = sort(list, list.length-1);
        System.out.println(Arrays.toString(list));
        list = sort(list);
        System.out.println(Arrays.toString(list));
    }

    public static int[] sort(int[] vet, int tam){
        int i, j, x;
        for (i=2; i<=tam; i++){
            x = vet[i];
            j=i-1;
            vet[0] = x; 
            while (x < vet[j]){
                vet[j+1] = vet[j];
                j--;
            }
            vet[j+1] = x;
        }
        return vet;
    }

    public static int[] sort(int[] vet){
        int i, j;
        for (i=0; i<=vet.length; i++){
            for (j=i+1; j<vet.length; j++) {
                if(vet[i] > vet[j]){
                    int temp = vet[i];
                    vet[i] = vet[j];
                    vet[j] = temp;
                }
            }
        }
        return vet;
    }
}
