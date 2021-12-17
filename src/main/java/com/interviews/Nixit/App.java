package com.interviews.Nixit;

public class App{

    public static void main(String[] args) {
        String[][] matriz = {{"1","0","1"},{"0","0","1"},{"0","1","1"}};
        //List<List<String>> list = new ArrayList<List<String>>(Arrays.asList(matriz));
        String line = "";
        for (String[] list : matriz) {
            for(String list2 : list){
                line += list2;
            }
        }
        int num = findIslandsOf1(line);
        System.out.println("Number of islands of 1: " + num);
    }

    public static int findIslandsOf1(String line){
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if(i >= line.length()-1) break;
            if(line.charAt(i) == '1' && line.charAt(i+1) != '1'){
                count++;
            }
        }
        return count;
    }
    
}