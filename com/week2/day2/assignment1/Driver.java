package com.week2.day2.assignment1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Driver
{
    public static void main(String[] args)
    {
        StoryController game = new StoryController();
        String playAgain = "N";
        String wikiString = "";
        
        //Get pre-story from file
        Path wiki_path = Paths.get("C:/Users/admin/workspace/SSA1/src/com/week2/day2/assignment1", "PreStory.txt");
        try
        {
            byte[] wikiArray = Files.readAllBytes(wiki_path);
            wikiString = new String(wikiArray, "ISO-8859-1");
        } catch (IOException e)
        {
            // TODO Auto-generated catch block
            //e.printStackTrace();
        }
        
        do
        {
            if (wikiString.equals(""))
            {
                game.startStory();
            }
            else
            {
                game.startStory(wikiString);
            }
            
            System.out.println("Would you like to play again (Y/N)?");
            playAgain = game.getUserChoice();
        } while (playAgain.equals("Y") || playAgain.equals("YES"));
       
       
        
    }
}
