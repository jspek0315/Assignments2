package com.week1.day5.assignment1.MethodsAndFlow;

public class TestMethodsAndFlow
{

    public static void main(String[] args)
    {
        String[] arr;
        // TODO Auto-generated method stub
        if(args.length == 0)
        {
            arr = new String[3];
            arr[0]= "Hello";
            arr[1]= "Goodbye";
            arr[2]= "Something";
        }
        else
        {
            arr  = args; 
        }
        
        
        MethodsAndFlow obj1 = new MethodsAndFlow(arr);
        
        try
        {
            System.out.println("Print All");
            obj1.outputAll();
            System.out.println("\nPrint Subset");
            obj1.outputSubset(0, 2);
            System.out.println("\nGenerate Out Of Bounds exception");
            obj1.outputSubset(-1, 3);
        } catch (Exception e)
        {
            System.out.println("Array Out of bounds exception genearted");
        }

    }

}
