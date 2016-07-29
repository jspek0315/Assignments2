package com.week2.day5.assignment1;

public class Shape
{
    private String name; 
    private double area;
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getArea()
    {
        return area;
    }
    public void setArea(double area)
    {
        this.area = area;
    }
    
    public Shape()
    {
       this("I'm a shape",0);
    }
    
    /**
     * @param name
     * @param area
     */
    public Shape(String name, double area)
    {
        this.name = name;
        this.area = area;
    } 
    
    
}
