package com.java;
 //toString() – This method prints exception information in the format of Name of the exception:
 // description of the exception
public class ExceptionHandlingjavaToStringMethod
{
    public static void main(String[] args)
    {
        try {
            int s1 = 1;
            int s2 = 0;
            int result=s1/s2;
            System.out.println(result);
        }
        catch(Exception e)
        {
           // System.out.println(e);
            System.out.println(e.toString());
        }
    }
}
