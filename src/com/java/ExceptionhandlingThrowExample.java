package com.java;

import java.util.Scanner;
class VotingAgeException extends RuntimeException
{
    VotingAgeException(String msg)
    {
        super(msg);

    }
}

public class ExceptionhandlingThrowExample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of voter");
        int age=sc.nextInt();
        try {
            if (age < 18) {
                throw new VotingAgeException("voter is not eligible for voting");
            } else {
                System.out.println("voter is eligible for voting");

            }
        }
        catch(VotingAgeException e)
        {
            System.out.println(e);
        }
        System.out.println("Thank you your voting is successfully");

    }
}
