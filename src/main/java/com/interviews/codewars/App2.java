package com.interviews.codewars;

import java.util.Arrays;

public class App2 {

    public static void main(String[] args){
        int[] myIntArray = {1, 2, 3, 4, 1, 2, 3};
        System.out.println(findEvenIndex(myIntArray));
    }
    
    public static int findEvenIndex(int[] arr) {
        //iterate over arr and test all positions from 0 index
        for(int i = 0; i < arr.length; i++){
          int sumRight = sumNumbers(Arrays.copyOfRange(arr, i, arr.length)); 
          int sumLeft = sumNumbers(Arrays.copyOfRange(arr, 0, i+1));
          if(sumRight == sumLeft) return i;
        }
        return -1;
    }
      

    public static int sumNumbers(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
          sum += arr[i];
        }
        return sum;
      }
}
