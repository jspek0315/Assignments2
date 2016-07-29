package com.week2.day5.assignment1;

public class ProgramDriver
{
    public static void main(String[] args)
    {
        Shape mySquare = new Square(5);
        Shape myColorSquare = new ColorSquare(4,"Blue");
        
        System.out.println("The are of " + mySquare.getName() + " is " + mySquare.getArea() + " .");
        System.out.println(myColorSquare.toString());
        
    }

}
