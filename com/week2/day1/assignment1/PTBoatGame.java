package com.week2.day1.assignment1;

public class PTBoatGame
{
    private PTBoat[] ptBoats;
    private int numberOfBoats = 0;

    public PTBoatGame()
    {
    }

    public PTBoatGame(int numBoats)
    {
        ptBoats = new PTBoat[numBoats];
    }

    public void addBoat(String row, int column)
    {
        // Add a new boat to the ptBoats array

        // You will need to use the numberOfBoats
        // value to tell you what element of the
        // array to initialize
        ptBoats[numberOfBoats] = new PTBoat(row, column);
        // remember to increment the numberOfBoats
        // before you leave
        numberOfBoats++;
    }

    public boolean guess(String row, int column)
    {
        boolean isFound = false;
        int arrayLooper = 0;
        // Check to see if the guess hit any of the ships.
        // Return true only if a ship was hit

        while (isFound == false && arrayLooper < numberOfBoats)
        {
            isFound = ptBoats[arrayLooper].isHit(row, column);
            arrayLooper++;
        }
        return isFound;
    }

    public static void main(String[] args)
    {
        // Create a PTBoatGame instance
        PTBoatGame game1 = new PTBoatGame(6);
        int numGuess = 6;
        int guessCounter = 0;

        // Add 6 PTBoats
        for (int i = 0; i < 6; i++)
        {
            game1.addBoat("A", i);
        }

        // Take six guesses and output the following string for each
        game1.guess("A", 0);
        game1.guess("A", 1);
        game1.guess("A", 2);
        game1.guess("A", 3);
        game1.guess("A", 4);
        game1.guess("B", 5);

        // If the guess hit a pt boat...
        // Guess number # at row <row>, column <column> hit a PTBoat
        for (PTBoat myBoat : game1.ptBoats)
        {
            if (myBoat.isHitStatus())
            {
                String msg = "Guess number: " + (guessCounter + 1) + " hit boat on: " + myBoat.getRow()
                        + myBoat.getColumn();
                System.out.println(msg);
                guessCounter++;
            }
        }
        // If the guess missed all boats
        // Guess number # missed
        String msg2 = "There are " + (numGuess - guessCounter) + " missed attempts";
        System.out.println(msg2);

    }
}
