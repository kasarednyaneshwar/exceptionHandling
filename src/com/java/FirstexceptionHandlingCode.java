package com.java;

public class FirstexceptionHandlingCode
{
    public static void main(String[] args)
    {
        try
        {
            int a = 100;
            int b = 0;
            int c;
            System.out.println(a / b);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try {
            String name = null;
            System.out.println(name.length());
        }
        catch(Exception s)
        {
            System.out.println(s);
        }
        System.out.println("my main code is executed");

    }
}
