package com.week2.day1.assignment1;

public class PTBoat
{
    String row;
    int column;
    boolean hitStatus;
    
    public PTBoat()
    {
        this("A",0);
    }
    
    /**
     * @param row
     * @param column
     */
    public PTBoat(String row, int column)
    {
        this.row = row;
        this.column = column;
        this.hitStatus = false;
    }

    public String getRow()
    {
        return row;
    }

    public void setRow(String row)
    {
        this.row = row;
    }

    public int getColumn()
    {
        return column;
    }

    public void setColumn(int column)
    {
        this.column = column;
    }
    
    public boolean isHit(String row, int column)
    {
        boolean returnVal = false;
        if(this.column == column && this.row.equals(row))
        {
            returnVal = true;
            this.hitStatus = true;
        }
        else
        {
            returnVal = false;
        }
        
        return returnVal;
    }

    public boolean isHitStatus()
    {
        return hitStatus;
    }

    public void setHitStatus(boolean hitStatus)
    {
        this.hitStatus = hitStatus;
    }
    

    
}
