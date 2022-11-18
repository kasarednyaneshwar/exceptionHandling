package com.java;

import java.util.Scanner;

class AgeNotEligible extends RuntimeException
{
    AgeNotEligible(String msg)
    {
        super(msg);
    }

}
public class ThrowKeywordInJava
{
    public static void main(String[] args)
{
    try
    {
        System.out.println("enter a  voter age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 18)
        {
            throw new AgeNotEligible("citizen is not eligible for voting");
        } else
        {
            System.out.println("citizen is  eligible for voting");
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    System.out.println("your voting is successfully done");
}

}
