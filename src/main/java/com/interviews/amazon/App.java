package com.interviews.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    
    public static void main(String[] args){
        List<String> products = new ArrayList<String>(Arrays.asList("bags","baggage","backpack","baggaa"));
        String search = "bags";
        System.out.println("Keywords found: \n" + showKeyWordsOnSearching(products,search));
    }

    private static List<List<String>> showKeyWordsOnSearching(List<String> products, String search){
        List<List<String>> result = new ArrayList<List<String>>();
        for (int i = 0; i < search.length(); i++) {
            String searchPrefix = search.substring(0, i+1).toLowerCase();
            if(searchPrefix.length() > 1){
                List<String> productsFound = findProductsAndSort(searchPrefix,products);
                result.add(productsFound);
            }
        }
        return result;
    }

    private static List<String> findProductsAndSort(String searchPrefix, List<String> products) {
        List<String> productsFound = new ArrayList<String>();
        for (String product : products) {
            String p = product.toLowerCase();
            if(p.startsWith(searchPrefix) || p.equals(searchPrefix)){
                productsFound.add(product);
            }
        }
        productsFound.sort(Comparator.naturalOrder());
        List<String> limitedList = productsFound.stream().limit(3).collect(Collectors.toList());
        return limitedList;
    }
}
