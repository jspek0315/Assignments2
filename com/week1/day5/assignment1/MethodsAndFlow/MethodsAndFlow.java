package com.week1.day5.assignment1.MethodsAndFlow;

public class MethodsAndFlow 
{
    String[] StringArray;

    public MethodsAndFlow()
    {
       //Initially Left Blank
    }
    
    /**
     * @param stringArray
     */
    public MethodsAndFlow(String[] stringArray)
    {
        this.StringArray = stringArray;
    }
    
    public void outputSubset(int startPosition, int numberOfValues)
    {
        if(startPosition < 0)
        {
            throw new IllegalArgumentException("Start Position is less then 0");
        }
        else if (startPosition >= StringArray.length)
        {
            throw new IllegalArgumentException("Start Position is larger then Array");
        }
        else if (numberOfValues <= 0)
        {
            throw new IllegalArgumentException("Number of values is less then or equal to 0");
        }
        else if ((startPosition + numberOfValues) > StringArray.length)
        {
            throw new IllegalArgumentException("Attempting to access out of bounds");
        }
        
        String msg = "";
        
        int i = startPosition;
        for (; i < (startPosition + numberOfValues - 1); i++)
        {
            msg += StringArray[i]+ ",";
            
        }
        msg += StringArray[i];
        
        System.out.println(msg);
        
    }
    
    public void outputAll()
    {
        outputSubset( 0, StringArray.length);
    }
    
    
    
    
}
