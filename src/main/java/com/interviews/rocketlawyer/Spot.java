package com.interviews.rocketlawyer;

public class Spot extends SeatRow implements Comparable<Spot>{
    
    public int number;
    public boolean isAvailable;

    public Spot(int number, boolean isAvailable, String letter){
        this.letter = letter;
        this.number = number;
        this.isAvailable = isAvailable;
    }

    public String getSeatName(){
        return this.number + letter;
    }

    @Override
    public int compareTo(Spot o) {
        if(this.number > o.number){
            return 1;
        }else
        if(this.number < o.number){
            return -1;
        }
        return 0;
    }
}
