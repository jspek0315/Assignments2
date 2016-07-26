package com.week2.day2.assignment1;

import java.util.Scanner;

public class StoryController
{
    Scanner sc = new Scanner(System.in);
    String userLastChoice;

    public void setSc(Scanner sc)
    {
        this.sc = sc;
    }

    public StoryController()
    {
        this.userLastChoice = "";
    }

    public void startStory()
    {
        //Create Story Object
        Story myStory = new Story();
        
        // Display Introduction and Instruction Message
        generateInstruction();

        // Get user input
        userLastChoice = getUserChoice();

        // Validate input
        if (isUserInputValid(userLastChoice))
        {
            // Enter Story
            switch (userLastChoice)
            {
            case "A":
                // Run Story 1
                myStory.setIntro(StoryTexts.StoryOneIntro.getMsgTxt());
                myStory.setOptionTxt(StoryTexts.StoryOneOptions.getMsgTxt());
                myStory.setPath1Result(StoryTexts.StoryOneA.getMsgTxt());
                myStory.setPath2Result(StoryTexts.StoryOneB.getMsgTxt());
                myStory.setPath3Result(StoryTexts.StoryOneC.getMsgTxt());
                break;
            case "B":
                // Run Story 2
                myStory.setIntro(StoryTexts.StoryTwoIntro.getMsgTxt());
                myStory.setOptionTxt(StoryTexts.StoryTwoOptions.getMsgTxt());
                myStory.setPath1Result(StoryTexts.StoryTwoA.getMsgTxt());
                myStory.setPath2Result(StoryTexts.StoryTwoB.getMsgTxt());
                myStory.setPath3Result(StoryTexts.StoryTwoC.getMsgTxt());
                break;
            case "C":
                // Run Story 3
                myStory.setIntro(StoryTexts.StoryThreeIntro.getMsgTxt());
                myStory.setOptionTxt(StoryTexts.StoryThreeOptions.getMsgTxt());
                myStory.setPath1Result(StoryTexts.StoryThreeA.getMsgTxt());
                myStory.setPath2Result(StoryTexts.StoryThreeB.getMsgTxt());
                myStory.setPath3Result(StoryTexts.StoryThreeC.getMsgTxt());
                break;
            }
            
            playStory(myStory);

        }
        else
        {
            System.out.println("You entered incorrect value");
        }
    }

    private void playStory(Story myStory)
    {
        System.out.println(myStory.getIntro());
        System.out.println(myStory.getOptionTxt());
        userLastChoice = getUserChoice();
        
        // Validate input
        while(!isUserInputValid(userLastChoice))
        {
            System.out.println("You entered an incorrect value");
            System.out.println("Please enter a correct value");
            userLastChoice = getUserChoice();
        }
        
        if (isUserInputValid(userLastChoice))
        {
            switch (userLastChoice)
            {
            case "A":
                System.out.println(myStory.getPath1Result());
                break;
            case "B":
                System.out.println(myStory.getPath2Result());
                break;
            case "C":
                System.out.println(myStory.getPath3Result());
                break;
            default:
                //Should never reach
                System.out.println("You entered incorrect value");
            }
        }
    }
    
    private void generateInstruction()
    {
        // Display Introduction and instructions
        System.out.println(StoryTexts.IntroText.getMsgTxt());
        System.out.print(StoryTexts.StorySelection.getMsgTxt());
        System.out.println(StoryTexts.StoryChoices.getMsgTxt());
        System.out.print(StoryTexts.InstructionText.getMsgTxt());
    }

    public String getUserChoice()
    {
        String userInput = sc.nextLine();
        userInput = userInput.trim().toUpperCase();
        return userInput;
    }

    private boolean isUserInputValid(String userChoice)
    {
        boolean returnVal = false;

        switch (userChoice)
        {
        case "A":
        case "B":
        case "C":
            returnVal = true;
            break;

        default:
            returnVal = false;
            break;
        }

        return returnVal;
    }

}
