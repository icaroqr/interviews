package com.interviews.amazon;

import java.util.ArrayList;
import java.util.List;

public class Test {
 
    public static void main(String[] args){
       int[] test = {1,3,2};
       boolean result = solution(test);
       System.out.println(result);
    }

    static boolean solution(int[] sequence) { 
        boolean isPossible = false;
        List<Integer> sequenceList = convertToList(sequence);
        
        for(int i=sequenceList.size()-1; i>=0; i--){
            List<Integer> newSequence = sequenceList.subList(0, i);
            if(isSequence(newSequence)){
                isPossible = true;
                break;
            }
        }
        return isPossible;
    }
    
    static List<Integer> convertToList(int[] sequence) {
        List<Integer> sequenceList = new ArrayList<>(sequence.length);
        for (int i = 0; i < sequence.length; i++) {
            sequenceList.add(sequence[i]);
        }
        return sequenceList;
    }
    
    static boolean isSequence(List<Integer> list){
        boolean isSequence = false;
         for(int i=0; i<list.size(); i++){
            if(i < list.size()-1){
                if(list.get(i) < list.get(i+1)){
                    isSequence = true;
                    break;
                }
            }
        }
        return isSequence;
    }
}
