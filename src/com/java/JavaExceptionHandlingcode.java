package com.java;

import java.util.Scanner;

class marksBoundException extends RuntimeException
{
    marksBoundException(String msg)
    {
        super(msg);
    }
}
public class JavaExceptionHandlingcode
{
    public static void main(String[] args)
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the marks of student");
                int marks=sc.nextInt();
                try {
                    if (marks < 35) {
                        throw new marksBoundException("Student is fail every subject");
                    }
                    else
                    {
                        System.out.println("student is pass each subject");

                    }
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                System.out.println("best of luck");




           }
}
