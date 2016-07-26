package com.week2.day2.assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StoryTests
{

    Story myStory;
    
    @Before
    public void setup()
    {
        myStory = new Story();
    }
    
    @Test
    public void testGettersAndSetters()
    {
        String myIntro = "My Intro";
        String myOptions = "My Options";
        String myPath1 = "My path 1";
        String myPath2 = "My path 2";
        String myPath3 = "My path 3";
        
        myStory.setIntro(myIntro);
        myStory.setOptionTxt(myOptions);
        myStory.setPath1Result(myPath1);
        myStory.setPath2Result(myPath2);
        myStory.setPath3Result(myPath3);
        
        assertEquals(myIntro, myStory.getIntro());
        assertEquals(myOptions, myStory.getOptionTxt());
        assertEquals(myPath1, myStory.getPath1Result());
        assertEquals(myPath2, myStory.getPath2Result());
        assertEquals(myPath3, myStory.getPath3Result());
        
    }
    

}
