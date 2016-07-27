package com.week2.day3.assignment1b;

import java.util.ArrayList;
import java.util.Collection;

public class BusStop
{
    private ArrayList<Rider> waitingRiders = new ArrayList<>();
    private int stopNumber;
    


    public BusStop(int stopNumber)
    {
        this.stopNumber = stopNumber;
    }
    
    public void busHasArrived(Bus bus)
    {
        // Move all the waiting riders into the bus

        // Remove all the riders from the Bus whose destination is this BusStop
    }

    public void addWaitingRider(Rider rider)
    {
    }
    
    public int getStopNumber()
    {
        return stopNumber;
    }

    public void setStopNumber(int stopNumber)
    {
        this.stopNumber = stopNumber;
    }

    public Collection<? extends Rider> getRiders()
    {
        return waitingRiders;
    }

}
