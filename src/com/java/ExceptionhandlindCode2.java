package com.java;

public class ExceptionhandlindCode2
{
    public static void main(String[] args)
    {
        try {
            String name = null;
            System.out.println(name.length());
        }
        catch(Exception s)
        {
        s.printStackTrace();//print exception,description & stack trace
            System.out.println(s);//print exception,description & stack trace
            s.toString();//only print description and exception class
            s.getMessage();//only print description
        }
    }
}
