package com.week2.day3.assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Batter> listOfBatters = new ArrayList<>();
        String userSelection = "";
        System.out.println("Welcome to Baseball Program\n");
        
        do
        {
            Batter myBatter = new Batter();
            String numTimes = "";
            
            System.out.println("Please Enter the name of the player:");
            myBatter.setName(sc.nextLine());
            System.out.println("\nHow many times has " + myBatter.getName() + " come to bat?");
            numTimes = sc.nextLine();
            myBatter.setNumberOfTimesAtBat(numTimes);
            System.out.println("");
            
            for (int i = 0; i <myBatter.getNumberOfTimesAtBat(); i++)
            {
                String numBases= "";
                System.out.println("How many bases did he/she get at bat number: " + (i+1) + " ?");
                numBases = sc.nextLine();
                myBatter.addNumberOfBases(numBases);
            }
            
            myBatter.printBattingAverage();
            myBatter.printSluggingPercentage();
            
            listOfBatters.add(myBatter);
            
            System.out.println("\nDo you want to continue?");
            
            
            userSelection = sc.nextLine();
            
            while(!(userSelection.trim().toUpperCase().equals("Y")||(userSelection.trim().toUpperCase().equals("N"))))
            {
                System.out.println("You entered an invalid choice please type 'Y' or 'N'");
                userSelection = sc.nextLine();
            }
            
        } while (userSelection.trim().toUpperCase().equals("Y"));

        
        //Print the final Stats
        System.out.println("The final overal summery is: ");
        for (Batter batter : listOfBatters)
        {
            System.out.println("Batter: " + batter.getName());
            batter.printBattingAverage();
            batter.printSluggingPercentage();
            System.out.println("");
        }
    }
}
