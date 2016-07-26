package com.week2.day2.assignment1;

public class Driver
{
    public static void main(String[] args)
    {
        StoryController game = new StoryController();
        String playAgain = "N";
        
        do
        {
            game.startStory();
            System.out.println("Would you like to play again (Y/N)?");
            playAgain = game.getUserChoice();
        } while (playAgain.equals("Y") || playAgain.equals("YES"));
       
        
        
    }
}
