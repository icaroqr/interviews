package com.interviews.rocketlawyer;

import java.util.List;

public class Airplane {
    
    public int id;
    public List<SeatRow> seatRows;

    public Airplane(int id, List<SeatRow> seatRows){
        this.id = id;
        this.seatRows = seatRows;
    }
}
