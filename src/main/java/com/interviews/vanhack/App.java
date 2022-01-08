package com.interviews.vanhack;

import java.util.*;

public class App{

    public static void main(String[] args) {
        String signals = ".??";
        List<String> result = possibilities(signals);
        System.out.println(result);
    }

    public static List<String> possibilities(String signals) {
      Map<String, String> morseCode = getMorseTable();
      List<String> possibilities = new ArrayList<String>();
      int unknownSignalCount = getUnknownSignalCount(signals);
      
      switch(signals.length()){
        case 1:
          if(signals.equals(".")){
            possibilities.add("E");
          }else
          if(signals.equals("-")){
            possibilities.add("T");
          }else{
            possibilities.addAll(Arrays.asList("E","T"));
          }
          break;
        case 2:
          if(signals.indexOf("?") == -1){
            possibilities.add(morseCode.get(signals));
          }else{
            possibilities.addAll(findSecondGroupOfPossibilities(signals,unknownSignalCount));
          }
          break;
        case 3:
          if(signals.indexOf("?") == -1){
            possibilities.add(morseCode.get(signals));
          }else{
            possibilities.addAll(findThirdGroupOfPossibilities(signals,unknownSignalCount));
          }
          break;
      }
      return possibilities;
  }

 
  private static int getUnknownSignalCount(String signals) {
     int count = 0;
      for (int i = 0; i < signals.length(); i++) {
        if(signals.charAt(i) == '?'){
          count++;
        }
      }
      return count;
    }

  private static List<String> findSecondGroupOfPossibilities(String signals, int count) {
    if(count > 1){
      return Arrays.asList("I","A","N","M");
    }else{
      if(signals.indexOf("?") == 0){
        if(signals.substring(1).equals(".")){
          return Arrays.asList("I","N");
        }else{
          return Arrays.asList("A","M");
        }
      }else{
        if(signals.substring(0,1).equals(".")){
          return Arrays.asList("I","A");
        }else{
          return Arrays.asList("N","M");
        }
      }
    }
  }

  private static List<String> findThirdGroupOfPossibilities(String signals, int count) {
    if(count == 1){
      if(signals.indexOf("?") == 0){
          if(signals.substring(1).startsWith(".")){
            //?.
            if(signals.substring(2).equals(".")){ 
                return Arrays.asList("S","D"); //?..
            }else{
                return Arrays.asList("U","K"); //?.-
            }
          }else{
            //?-
            if(signals.substring(2).equals(".")){ 
              return Arrays.asList("R","G"); //?-.
            }else{
              return Arrays.asList("W","O"); //?--
            }
          }
      }else
      if(signals.indexOf("?") == 1){
          if(signals.substring(0,1).startsWith(".")){
            //.?
            if(signals.substring(2).equals(".")){
              return Arrays.asList("S","R"); //.?.
            }else{
              return Arrays.asList("U","W"); //.?-
            }
        }else{
            //-?
            if(signals.substring(2).equals(".")){
              return Arrays.asList("D","G"); //-?.
            }else{
              return Arrays.asList("K","O"); //-?-
            }
        }
      }else{
      if(signals.indexOf("?") == 2){
          if(signals.substring(0).startsWith(".") && signals.substring(1,2).equals(".")){
              return Arrays.asList("S","U"); //..?
          }else
          if(signals.substring(0).startsWith("-") && signals.substring(1,2).equals(".")){
              return Arrays.asList("D","K"); //-.?
          }else
          if(signals.substring(0).startsWith(".") && signals.substring(1,2).equals("-")){
              return Arrays.asList("R","W"); //.-?
          }else
          if(signals.substring(0).startsWith("-") && signals.substring(1,2).equals("-")){
              return Arrays.asList("G","O"); //--?
          }
        }
      }
    }else
    if(count == 2){
      if(signals.startsWith(".")){
        return Arrays.asList("S","U","R","W"); //.??
      }else
      if(signals.startsWith("-")){
        return Arrays.asList("D","K","G","O"); //-??
      }else
      if(signals.endsWith(".")){
        return Arrays.asList("S","R","D","G"); //??.
      }else
      if(signals.endsWith("-")){
        return Arrays.asList("U","W","K","O"); //??-
      }else
      if(signals.substring(1,2).equals(".")){
        return Arrays.asList("S","U","D","K"); //?.?
      }else
      if(signals.substring(1,2).equals("-")){
        return Arrays.asList("R","W","G","O"); //?-?
      }
    }else
    if(count == 3){
      return Arrays.asList("S","U","R","W","D","K","G","O"); //???
    }
    return Arrays.asList("NOT FOUND");
  }

  private static Map<String, String> getMorseTable(){
    Map<String, String> morseCode = new HashMap<String, String>();
    
    morseCode.put(".","E");
    morseCode.put("-","T");
    morseCode.put("..","I");
    morseCode.put(".-","A");
    morseCode.put("-.","N");
    morseCode.put("--","M");
    morseCode.put("...","S");
    morseCode.put("..-","U");
    morseCode.put(".-.","R");
    morseCode.put(".--","W");
    morseCode.put("-..","D");
    morseCode.put("-.-","K");
    morseCode.put("--.","G");
    morseCode.put("---","O");
    
    return morseCode;
  }

}