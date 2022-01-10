package com.interviews.vanhack;

import com.interviews.vanhack.model.PokerHand;
import com.interviews.vanhack.model.PokerHand.Result;

public class App2{
  
     public static void main(String[] args) {
      
          PokerHand p1 = new PokerHand("2H 3H 4H 5H 6H");
          PokerHand p2 = new PokerHand("AS AD AC AH JD");
          Result result = p1.compareWith(p2);
          System.out.println(result);
    }
}