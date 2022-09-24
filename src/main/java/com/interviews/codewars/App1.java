package com.interviews.codewars;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    
    public static void main(String[] args){
        List<Object> listOfIntegersAndStrings = new ArrayList<>();
        listOfIntegersAndStrings.add(1);
        listOfIntegersAndStrings.add(2);
        listOfIntegersAndStrings.add("a");
        listOfIntegersAndStrings.add("b");
        listOfIntegersAndStrings.add("c");
        listOfIntegersAndStrings.add(3);
        System.err.println(filterList(listOfIntegersAndStrings));

        String test = "camelCaseTest";
        System.out.println(returnSpacedString(test));

    }

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        List<Object> filteredItems = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Integer){
                filteredItems.add(list.get(i));
            }
        }
        return filteredItems;
    }

    public static String returnSpacedString(String input){
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if(Character.isUpperCase(input.charAt(i))){
                resultString.append(" ");
                resultString.append(input.charAt(i));
            }else{
                resultString.append(input.charAt(i));
            }
        }
        return resultString.toString();
    }

}
