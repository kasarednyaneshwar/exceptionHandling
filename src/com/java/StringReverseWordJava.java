package com.java;

import java.util.Scanner;

public class StringReverseWordJava
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String myName=sc.nextLine();
        String[] word=myName.split(" ");
        String name="";
        for(String words:word)
        {
            for(int i=words.length()-1;i>=0;i--)
            {
                name=name+words.charAt(i);
            }
            name=name+" ";
        }
        System.out.println("String of each word is reverse :"+name);



    }
}
