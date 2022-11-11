package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagramJava
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Enter a first string
        System.out.println("Enter first String");
        //Enter a second string
        String x=sc.nextLine();
        System.out.println("Enter second String");
        String y=sc.nextLine();
        //String converted to Array
        char[] A=x.toCharArray();
        char[] B=y.toCharArray();
        // sorting a Array
        Arrays.sort(A);
        Arrays.sort(B);
        //By using boolean & equals check condition is a anagram or not.
        Boolean result=Arrays.equals(A,B);
        if(result==true)
        {
            System.out.println("given string is anagram ");

        }
        else
        {
            System.out.println("given string is not anagram ");

        }



    }
}
