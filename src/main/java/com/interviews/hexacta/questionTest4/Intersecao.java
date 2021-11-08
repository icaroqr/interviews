package com.interviews.hexacta.questionTest4;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersecao {
    
    public void printIntersectionAntiga(int[] setA, int[] setB) {
        if (setA != null && setB != null) {
            Arrays.sort(setA);
            Arrays.sort(setB);
            ArrayList<Integer> commonSet = new ArrayList<Integer>();

            for (int i = 0; i < setA.length; i++) {
                for (int j = 0; j < setB.length; j++) {
                    if (setA[i] == setB[j] && !commonSet.contains(setA[i])) {
                        commonSet.add(setA[i]);
                    }
                }
            }
        }
    }

    public void printIntersectionNova(int[] setA, int[] setB) {
        if (setA != null && setB != null) {
            Arrays.sort(setA);
            Arrays.sort(setB);
            ArrayList<Integer> commonSet = new ArrayList<Integer>();

            int i = 0;
            int j = 0; 
            while (i != setA.length && j != setB.length) { 
                if (setA[i] < setB[j]) {
                    i++;
                } else if (setA[i] > setB[j]) { 
                    j++;
                } else { 
                    commonSet.add(setA[i]); 
                    i++;
                    j++;
                }
            }
        }
    }

}
