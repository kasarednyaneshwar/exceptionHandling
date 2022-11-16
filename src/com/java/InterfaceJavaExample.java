package com.java;
interface School
{
    public void student();
}
class First implements School
{
    public void student()
    {
        System.out.println("First class student is very brilliant");
    }
}
class Second implements School
{
    public void student()
    {
        System.out.println("Second class student is sharp");
    }
}
public class InterfaceJavaExample
{
    public static void main(String[] args)
    {
        School s=new First();
        School s1=new Second();
        s.student();
        s1.student();

    }
}
