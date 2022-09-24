package com.interviews.rocketlawyer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GroupSeatChecker {
    
    public List<String> checkAvailableSpotsForGroups(int groupSize, Airplane airplane){
        List<Spot> availableSpots;
        //Check all rows for number 1 rule
        for(SeatRow row : airplane.seatRows){
            //Save available Spots
            availableSpots = new ArrayList<>();
            for (int i = 0; i < row.spots.size(); i++) {
                if(row.spots.get(i).isAvailable){
                    availableSpots.add(row.spots.get(i));
                }
            }
            //Order spots
            Collections.sort(availableSpots);
            //Check if exist a sequence that can fit the group
            List<Spot> spotsOnSequence = getSpotsInSequence(availableSpots, groupSize);
            if(!spotsOnSequence.isEmpty() && spotsOnSequence.size() >= groupSize){
                return returnSpotsName(spotsOnSequence);
            }
        }

        //Check all rows for number 2 rule
        for(SeatRow row : airplane.seatRows){
            availableSpots = new ArrayList<>();
            //Save available Spots
            for (int i = 0; i < row.spots.size(); i++) {
                if(row.spots.get(i).isAvailable){
                    availableSpots.add(row.spots.get(i));
                }
            }
            //Check if can fit the group
            if(availableSpots.size() >= groupSize){
                return returnSpotsName(availableSpots);
            }
        }
        //If doesn't find return an exception or empty array
        return new ArrayList<>();
    }

    private List<Spot> getSpotsInSequence(List<Spot> availableSpots, int groupSize) {
        //Check sequence
        List<Spot> spotsOnSequence = new ArrayList<>();
        for (int i = 0; i < availableSpots.size(); i++){
            if (i != 0 && availableSpots.get(i).number != availableSpots.get(i-1).number + 1){
                spotsOnSequence = new ArrayList<>();
            }else{
                if(availableSpots.get(i).isAvailable && spotsOnSequence.size() < groupSize){
                    spotsOnSequence.add(availableSpots.get(i));
                    if(spotsOnSequence.size() == groupSize){
                        return spotsOnSequence;
                    }
                 }
            }
        }
        return spotsOnSequence;
    }

    public List<String> returnSpotsName(List<Spot> spotList){
        return spotList.stream()
                    .map(Spot::getSeatName)
                    .collect(Collectors.toList());
    }

    public List<String> checkAvailableSpotsForGroups2(int groupSize, Airplane airplane){
        List<Spot> availableSpots = new ArrayList<>();
        //Find available Spots in all rows
        for(SeatRow row : airplane.seatRows){
            for (int i = 0; i < row.spots.size(); i++) {
                if(row.spots.get(i).isAvailable){
                    availableSpots.add(row.spots.get(i));
                }
            }
        }
        //Sort spots by number and letter
        Collections.sort(availableSpots);
        //Check if exist a sequence that can fit the group
        List<Spot> spotsOnSequence = getSpotsInSequence(availableSpots, groupSize);
        if(!spotsOnSequence.isEmpty() && spotsOnSequence.size() >= groupSize){
            return returnSpotsName(spotsOnSequence);
        }
        //If theres no sequene, check if can fit the group anyway
        if(availableSpots.size() >= groupSize){
            return returnSpotsName(availableSpots);
        }
        //Return empty list if can't fit the group
        return new ArrayList<>();
    }
}
