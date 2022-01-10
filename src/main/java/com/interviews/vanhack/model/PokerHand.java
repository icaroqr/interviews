package com.interviews.vanhack.model;

import java.util.HashMap;
import java.util.Map;

public class PokerHand
{    
    public enum Result { TIE, WIN, LOSS };
    private String[] cards;
    private String cardsOrder = "23456789TJQKA";

    public PokerHand(String hand){
      this.cards = hand.split(" ");
    }

    public Result compareWith(PokerHand opponentHand) {        
        int playerGameScore = returnBestGame(this.cards);
        int opponentGameScore = returnBestGame(opponentHand.cards);
        
        if(playerGameScore > opponentGameScore){
          return Result.WIN;
        }else
        if(playerGameScore < opponentGameScore){
          return Result.LOSS;
        }else{
          return Result.TIE;
        }
    }

    private int returnBestGame(String[] cards) {
        Map<String,Integer> games = getGames();
        String bestGame = "high_card";
        //Checks for a straight_flush
        if(checksStraightFlush(cards)){
          bestGame = "straight_flush";
        }
        return games.get(bestGame);
    }

    private Map<String, Integer> getGames(){
        Map<String,Integer> games = new HashMap<>();

        games.put("straight_flush", 9);
        games.put("four_of_a_Kind", 8);
        games.put("full_house", 7);
        games.put("flush", 6);
        games.put("straight", 5);
        games.put("three_of_a_Kind", 4);
        games.put("two_pair", 3);
        games.put("one_pair", 2);
        games.put("high_card", 1);
        
        return games;
    }

    private String returnBiggerCard(String card1, String card2){
      int position1 = cardsOrder.indexOf(card1);
      int position2 = cardsOrder.indexOf(card2);

      if(position1 > position2){
        return card1;
      }else{
        return card2;
      }
    }

    private boolean checksStraightFlush(String[] cards){
      int allSameSuitCount = 1;
      String firstCard = cards[0];
      //Check for same suit
      for (int i = 1; i < cards.length; i++) {
          if(firstCard.charAt(1) == cards[i].charAt(1)){
            allSameSuitCount++;
          }
       }
      if(allSameSuitCount != cards.length) return false;
      return true;
    }
}
