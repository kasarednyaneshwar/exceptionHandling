package com.java;

public class Stringpalidrome
{
    public static void main(String[] args)
    {
        String s="RADAR";
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);
          //  System.out.println("Reverse string of RADAR is:"+s1);

        }
        System.out.println(s1);

        if(s1.equals(s))
        {
            System.out.println("given string is a palindrome string");
        }
        else {
            System.out.println("given string is a not palindrome string");

        }



    }
}
