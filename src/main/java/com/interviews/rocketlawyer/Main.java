package com.interviews.rocketlawyer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Airplane airplane = new Airplane(1,null);
        airplane.seatRows = getSeatRows(airplane);

        GroupSeatChecker checker = new GroupSeatChecker();
        List<String> seats = checker.checkAvailableSpotsForGroups2(2, airplane);
        System.out.println("Available seats: " + seats);
    }

    public static List<SeatRow> getSeatRows(Airplane airplane){
        SeatRow seatRow1 = new SeatRow(airplane, "A", getSpotsRule1("A"));
        SeatRow seatRow2 = new SeatRow(airplane, "B", getSpotsRule2("B"));
        SeatRow seatRow3 = new SeatRow(airplane, "C", getSpotsRule1("C"));
        
        return new ArrayList<>(Arrays.asList(seatRow1, seatRow2, seatRow3));
    }

    public static List<Spot> getSpotsRule1(String letter){
        Spot spot1 = new Spot(1, true, letter);
        Spot spot2 = new Spot(2, true, letter);
        Spot spot3 = new Spot(5, false, letter);
        Spot spot4 = new Spot(7, false, letter);
        return new ArrayList<>(Arrays.asList(spot1, spot2, spot3,spot4));
    }

    public static List<Spot> getSpotsRule2(String letter){
        Spot spot1 = new Spot(1, false, letter);
        Spot spot2 = new Spot(2, true, letter);
        Spot spot3 = new Spot(3, true, letter);
        Spot spot4 = new Spot(4, false, letter);
        Spot spot5 = new Spot(5, false, letter);
        Spot spot6 = new Spot(6, true, letter);
        return new ArrayList<>(Arrays.asList(spot1, spot2, spot3,spot4, spot5, spot6));
    }
}
