package com.interviews.rocketlawyer;

import java.util.List;

public class SeatRow {
    
    public Airplane airplane;
    public String letter;
    public List<Spot> spots;

    public SeatRow(Airplane plane, String letter, List<Spot> spots){
        this.airplane = plane;
        this.letter = letter;
        this.spots = spots;
    }

    public SeatRow(){}
}
