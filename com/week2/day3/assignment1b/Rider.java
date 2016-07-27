package com.week2.day3.assignment1b;

public class Rider
{
    private BusStop destinationBusStop;
    private BusStop originBusStop;
    private String name;
    

    public Rider(BusStop currentStop)
    {
        this.originBusStop = currentStop;
    }
    
    public void setDestinationBusStop(BusStop destinationStop)
    {
        this.destinationBusStop = destinationStop;
    }   
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
