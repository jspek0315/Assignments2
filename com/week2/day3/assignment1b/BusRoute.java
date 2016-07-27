package com.week2.day3.assignment1b;

import java.util.ArrayList;

public class BusRoute
{
    private ArrayList<BusStop> busStops = new ArrayList<>();
    
    public BusRoute()
    {
        // Create several BusStops and add them to busStops
        // Add a few waiting Riders to each BusStop
        BusStop stop1 = new BusStop(1);
        BusStop stop2 = new BusStop(2);
        BusStop stop3 = new BusStop(3);
        
        Rider rider1 = new Rider(stop1);
        rider1.setDestinationBusStop(stop2);
        rider1.setName("Bob");
        stop1.addWaitingRider(rider1);
        
        Rider rider2 = new Rider(stop1);
        rider2.setDestinationBusStop(stop3);
        rider2.setName("Jeff");
        stop1.addWaitingRider(rider2);
        
        Rider rider3 = new Rider(stop2);
        rider3.setDestinationBusStop(stop3);
        rider3.setName("Mark");
        stop2.addWaitingRider(rider3);
        
        
        busStops.add(stop1);
        busStops.add(stop2);
        busStops.add(stop3);        

    }
    
    public void startRoute()
    {

        // Create the Bus
        Bus bus = new Bus();
        
        // Loop through bus stops and make the 
        // Bus arrive at each
        for (BusStop busStop : busStops)
        {
            System.out.println("Visiting Stop Number: " + busStop.getStopNumber());
            bus.printRiders();
            bus.addRiders(busStop);  
        }
        
    }
    
    
    
}
