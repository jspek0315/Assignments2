package com.week2.day2.assignment1;

public class Story
{
    private String intro;
    private String optionTxt;
    private String path1Result;
    private String path2Result;
    private String path3Result;
    
    public Story()
    {
        this("","","","","");
    }
    
    /**
     * @param intro
     * @param instructions
     * @param path1Result
     * @param path2Result
     * @param path3Result
     */
    public Story(String intro, String instructions, String path1Result, String path2Result, String path3Result)
    {
        this.intro = intro;
        this.optionTxt = instructions;
        this.path1Result = path1Result;
        this.path2Result = path2Result;
        this.path3Result = path3Result;
    }
    public String getIntro()
    {
        return intro;
    }
    public void setIntro(String intro)
    {
        this.intro = intro;
    }
    public String getOptionTxt()
    {
        return optionTxt;
    }
    public void setOptionTxt(String instructions)
    {
        this.optionTxt = instructions;
    }
    public String getPath1Result()
    {
        return path1Result;
    }
    public void setPath1Result(String path1Result)
    {
        this.path1Result = path1Result;
    }
    public String getPath2Result()
    {
        return path2Result;
    }
    public void setPath2Result(String path2Result)
    {
        this.path2Result = path2Result;
    }
    public String getPath3Result()
    {
        return path3Result;
    }
    public void setPath3Result(String path3Result)
    {
        this.path3Result = path3Result;
    }
    
    
}
