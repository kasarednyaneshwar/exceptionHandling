package com.java;

import java.util.Scanner;

abstract class Calculation
{
    abstract void area();
    public void displyInfo()
    {
        System.out.println("These is my Abstract class method");
    }

}
class Circle extends Calculation
{
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a radius of circle ");
        int r=sc.nextInt();
        double Area=3.14*r*r;
        System.out.println("Area of a circle is "+Area);
    }
}
class Triangle extends Calculation
{
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a breath of Triangle ");
        int b=sc.nextInt();
        System.out.println("Enter a height of Triangle ");
        int h=sc.nextInt();
        double TriangleArea=0.5*b*h;
        System.out.println("Area of a circle is "+TriangleArea);

    }
}




public class JavaAbstractionCode1
{
    public static void main(String[] args)
    {

        Calculation c=new Circle();
        c.area();
        Calculation c1=new Triangle ();
        c.area();



    }
}
