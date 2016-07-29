package com.week2.day5.assignment1;

public class ColorSquare extends Square
{
    
    private String color;
    
    
    public ColorSquare()
    {
        this(0);
    }
    
    public ColorSquare(double width)
    {
        this(width, "No Color");
    }
    
    public ColorSquare(double width,String color)
    {
        super(width);
        this.color = color;
    }
    
    @Override
    public String toString()
    {
        return "I am a " + this.getName() +" with an area of " + this.getArea() +" and a color of " + this.color;
    }
    
     

}
