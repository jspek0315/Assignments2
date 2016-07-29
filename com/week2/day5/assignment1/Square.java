package com.week2.day5.assignment1;

public class Square extends Shape
{

    public Square()
    {
        this(0);
    }
    
    public Square(double width)
    {
        super("Square",width*width);
    }
    
    @Override
    public String toString()
    {
        return "Square with an area of " + this.getArea();
    }

}
