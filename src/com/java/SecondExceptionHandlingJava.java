package com.java;

public class SecondExceptionHandlingJava
{
    public static void main(String[] args)
    {
        try {


            int[] array = {10, 20, 30, 40};
            System.out.println(array[5]);
        }
        catch(Exception e)
        {
           System.out.println( e);

    }
        System.out.println("my main code is executed");
    }
}
