package com.week2.day2.assignment1;

public enum StoryTexts
{
    //Introductions Enums
    IntroText ("Welcome to Story Program!\n"),
    StorySelection("Please select which story would you like to play.\n"),
    InstructionText("Hit enter after you type your choice.\n"),
    
    //Story Selection Enums
    StoryChoices("A) Story 1\nB) Story 2\nC) Story 3\n"),
    A("Story 1"),B("Story 2"),C("Story 3"),
    
    //Story 1
    StoryOneIntro("You wake up, what do you do?"),
    StoryOneOptions("A) Brush teeth\nB) Go Back To sleep\nC) Play Computer Games"),
    StoryOneA("You Look in the mirror and you have the whites teeth possible\n"),
    StoryOneB("You Sleep for another 8 hours, and you realised you missed you class\n"),
    StoryOneC("You Play World of Warcraft for the next 98 hours straight\n"),
    
    //Story 2
    StoryTwoIntro("You go to school, what do you do?"),
    StoryTwoOptions("A) Study Hard\nB) Go to sleep\nC) Daydream in class"),
    StoryTwoA("You master the subject and get full ride to college\n"),
    StoryTwoB("You sleep so much you turn into a bat\n"),
    StoryTwoC("You daydream about playing World of Warcraft, it ruins your schooling\n"),
    
    //Story 3
    StoryThreeIntro("You go to the park, what do you do?"),
    StoryThreeOptions("A) Get Lost\nB) Go plant a tree\nC) Go to sleep"),
    StoryThreeA("You try to find your way out, but find a powerline, you follow the power line to civilization\n"),
    StoryThreeB("The tree turns out to produce sap that cures cancer\n"),
    StoryThreeC("You sleep so much you turn into a bear\n"); 
    
    String msgTxt;

    /**
     * @param asTxt
     */
    private StoryTexts(String asTxt)
    {
        this.msgTxt = asTxt;
    }
    
    public String getMsgTxt()
    {
        return msgTxt;
    }
    
}
