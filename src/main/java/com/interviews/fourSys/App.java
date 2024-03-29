package com.interviews.fourSys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class App {

    public static void main(String[] args){
        int[] arrayTest = {1,3,4,5,3,7,10,2};
        int total = 9;
        String result = findContinuousInterval(arrayTest,total);
        System.out.println("Result with best: "+result);

        String result2 = findContinuousInterval2(arrayTest,total);
        System.out.println("Result with bad: "+result2);

        int[] arrayDuplicate = {1,2,2,5,3,2,10,2};
        System.out.println("First duplicated index: "+findFirstDuplicatedIndex(arrayDuplicate));

        String str = "aaaccjjjdsadsasfsabb";
        String encoded = encode(str);
        System.out.println(encoded);

        StringBuilder strFormatada = formatarComEspacos(str,3);
        System.out.println(strFormatada);
    }    

    private static StringBuilder formatarComEspacos(String str, int n) {
        String strNoSpace = str.trim();
        List<String> listChars = new ArrayList<String>(Arrays.asList(strNoSpace));
        StringBuilder sb = new StringBuilder();
        for (String letter : listChars) {
            sb.append(letter);
            sb.append("\n");
        }
        return sb;
        
    }

    private static String encode(String str) {
        String encoded = "";
        int count = 0;
        char letter = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == letter){
                count++;
            }else{
                encoded += String.valueOf(count) + letter;
                count=1;
                letter = str.charAt(i);
            }
        }
        encoded += String.valueOf(count) + letter;
        return encoded;
        
    }

    //Best solution O(N)
    public static String findContinuousInterval(int[] array, int total){
        int sum = 0;
        int beginIndex = 0;
        //Iterate array changing both begin and end index to find if sum is greater than elements found in between
        for (int endIndex = 0; endIndex < array.length; endIndex++) {
            sum += array[endIndex];

            while (sum > total && beginIndex < endIndex){
                sum -= array[beginIndex];
                beginIndex++;
            }
            //When finds the range elements, return indexes
            if(sum == total){
                return String.valueOf(beginIndex + "," + endIndex);
            }
        }
        //If couldn't find an equal sum, returns -1
        return String.valueOf("-1");
    }

    //Not best solution O(N^2)
    public static String findContinuousInterval2(int[] array, int total){
        int sum;
        //Sum linear pushing onde index every iteration and testing combinations
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if(sum == total){
                    return String.valueOf(i + "," + j);
                }
            }
        }
        //If couldn't find an equal sum, returns -1
        return String.valueOf("-1");
    }

    //
    public static int findFirstDuplicatedIndex(int[] array){
        List<Integer> checkeds = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if(checkeds.contains(array[i])){
                return i;
            }else{
                checkeds.add(array[i]);
            }
        }
        return -1;
    }


}
