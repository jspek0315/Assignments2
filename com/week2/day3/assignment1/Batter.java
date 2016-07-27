package com.week2.day3.assignment1;

import java.util.ArrayList;

public class Batter
{
    private int numberOfTimesAtBat;
    private String name; 
    private ArrayList<Integer> numBasesPerAtBat;
    
    public Batter()
    {
        this(0);
    }
    
    /**
     * @param numberOfTimesAtBat
     */
    public Batter(int numAtBat)
    {
        this("No Name",numAtBat);
    }
    
    public Batter(String name)
    {
        this(name,0);
    }
    
    public Batter(String name, int numAtBat)
    {
        this.name = name;
        this.numberOfTimesAtBat = numAtBat;
        this.numBasesPerAtBat = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getNumberOfTimesAtBat()
    {
        return numberOfTimesAtBat;
    }

    public void setNumberOfTimesAtBat(int numberOfTimesAtBat)
    {
        this.numberOfTimesAtBat = numberOfTimesAtBat;
    }
    
    public void setNumberOfTimesAtBat(String numberOfTimesAtBat)
    {
        
        if(isNumeric(numberOfTimesAtBat) && Integer.parseInt(numberOfTimesAtBat) > 0)
        {
            this.numberOfTimesAtBat = Integer.parseInt(numberOfTimesAtBat);
        }
        else
        {
            this.numberOfTimesAtBat = 0;
        }
    }
    
    public void addNumberOfBases(String numBases)
    {
        if(isNumeric(numBases) && Integer.parseInt(numBases) >= 0 && Integer.parseInt(numBases) < 5)
        {
            numBasesPerAtBat.add(Integer.parseInt(numBases));
        }
        else
        {
            numBasesPerAtBat.add(0);
        }
    }
    
    private boolean isNumeric(String s) 
    {  
        return s.matches("[-+]?\\d*\\.?\\d+");  
    }

    public void printBattingAverage()
    {
        int numOfAtBatsWithHit = 0;
        double avg = 0;
        //Calculate number of at bat with hits
        for (Integer integer : numBasesPerAtBat)
        {
            if(integer != null && integer > 0 )
            {
                numOfAtBatsWithHit++;
            }
        }
        
        avg =  (double)numOfAtBatsWithHit/(double)numberOfTimesAtBat;
        
        System.out.println("Batting Average is: " + avg);
    }

    public void printSluggingPercentage()
    {
        int numOfBasesEarned = 0;
        double avg = 0;
        //Calculate number of at bat with hits
        for (Integer integer : numBasesPerAtBat)
        {
            if(integer != null && integer > 0 )
            {
                numOfBasesEarned += integer.intValue();
            }
        }
        
        avg =  (double)numOfBasesEarned/(double)numberOfTimesAtBat;
        
        System.out.println("Slugging percentage is: " + avg );
        
    } 
    
    
}
