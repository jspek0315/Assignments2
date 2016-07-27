package com.week2.day3.assignment1b;

import java.util.ArrayList;

public class Bus
{
    private ArrayList<Rider> riders = new ArrayList<>();

    public Bus()
    {
    }

    public void addRiders(BusStop busStop)
    {
        // Move all the riders in the BusStop into the Bus
        // Hint: There are shortcut methods to help do this in ArrayList class.

        // Make sure you remove the Riders from the BusStop before leaving
        riders.addAll(busStop.getRiders());
    }

    public void unLoadRiders(BusStop busStop)
    {
        // For any Rider that has the destinationStop matching the passed BusStop
        // Remove them from the Bus
    }
    
    public void printRiders()
    {
        if(riders == null || riders.size() == 0)
        {
            System.out.println("There are no riders on the bus.");
        }
        else
        {
            for (Rider rider : riders)
            {
                System.out.println(rider.getName());
            }
        }
    }
}
