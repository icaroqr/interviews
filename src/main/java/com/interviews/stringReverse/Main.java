package com.interviews.stringReverse;

public class Main {
    
    public static void main(String[] args){
        String revertIt = "Angelica";

        String result = revertString(revertIt);

        System.err.println("Original: " + revertIt + " Reverted: " + result);
    }

    public static String revertString(String str){
        char[] strArray = str.toCharArray();
        int lastCharPosition = strArray.length -1;
        char tempLetter;
        for (int i = 0; i < (strArray.length/2); i++) {
            tempLetter = strArray[i];
            strArray[i] = strArray[lastCharPosition];
            strArray[lastCharPosition] = tempLetter;
            lastCharPosition--;
        }
        return new String(strArray);
    }
}
