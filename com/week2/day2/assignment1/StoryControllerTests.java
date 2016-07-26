package com.week2.day2.assignment1;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class StoryControllerTests
{

    StoryController game;
    
    @Before
    public void setup()
    {
        game = new StoryController();
        
    }
    
    @Test
    public void testStoryControllerPathA1()
    {
        //game.startStory();
        
        String data = "A\nA\n";
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        
        InputStream old = System.in;
        try {
            
            System.setIn( testInput );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
            
            game.startStory();
        } finally {
            System.setIn( old );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
        }
        
    }
    
    @Test
    public void testStoryControllerPathB1()
    {
        //game.startStory();
        
        String data = "B\nA\n";
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        
        InputStream old = System.in;
        try {
            
            System.setIn( testInput );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
            
            game.startStory();
        } finally {
            System.setIn( old );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
        }
        
    }
    
    @Test
    public void testStoryControllerPathC1()
    {
        //game.startStory();
        
        String data = "C\nA\n";
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        
        InputStream old = System.in;
        try {
            
            System.setIn( testInput );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
            
            game.startStory();
        } finally {
            System.setIn( old );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
        }
    }
    
    @Test
    public void testStoryControllerPathA2()
    {
        //game.startStory();
        
        String data = "A\nb\n";
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        
        InputStream old = System.in;
        try {
            
            System.setIn( testInput );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
            
            game.startStory();
        } finally {
            System.setIn( old );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
        }
        
    }
    
    @Test
    public void testStoryControllerPathB2()
    {
        //game.startStory();
        
        String data = "B\nb\n";
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        
        InputStream old = System.in;
        try {
            
            System.setIn( testInput );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
            
            game.startStory();
        } finally {
            System.setIn( old );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
        }
        
    }
    
    @Test
    public void testStoryControllerPathC2()
    {
        //game.startStory();
        
        String data = "C\nb\n";
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        
        InputStream old = System.in;
        try {
            
            System.setIn( testInput );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
            
            game.startStory();
        } finally {
            System.setIn( old );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
        }
    }
    
    @Test
    public void testStoryControllerPathA3()
    {
        //game.startStory();
        
        String data = "A\nc\n";
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        
        InputStream old = System.in;
        try {
            
            System.setIn( testInput );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
            
            game.startStory();
        } finally {
            System.setIn( old );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
        }
        
    }
    
    @Test
    public void testStoryControllerPathB3()
    {
        //game.startStory();
        
        String data = "B\nc\n";
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        
        InputStream old = System.in;
        try {
            
            System.setIn( testInput );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
            
            game.startStory();
        } finally {
            System.setIn( old );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
        }
        
    }
    
    @Test
    public void testStoryControllerPathC3()
    {
        //game.startStory();
        
        String data = "C\nc\n";
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        
        InputStream old = System.in;
        try {
            
            System.setIn( testInput );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
            
            game.startStory();
        } finally {
            System.setIn( old );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
        }
    }
    
    @Test
    public void testStoryControllerPathInvalidPath()
    {
        //game.startStory();
        
        String data = "D\nc\n";
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        
        InputStream old = System.in;
        try {
            
            System.setIn( testInput );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
            
            game.startStory();
        } finally {
            System.setIn( old );
            Scanner sc = new Scanner(System.in);
            game.setSc(sc);
        }
    }
    
}
