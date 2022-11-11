package com.java;
abstract class Sample
{
   abstract  void car();
    public void Bike()
    {
        System.out.println("version 2.0 Bike");
    }


}
class Sample1 extends Sample
{
    public void car()
    {
        System.out.println("These is my new car");
    }
    public void cycle()
    {
        System.out.println("these is my first cycle");
    }
}
public class javaAbstractionCode
{
    public static void main(String[] args)
    {
        Sample s=new Sample1();
        s.Bike();
        s.car();
      Sample1 s1=new Sample1();
       s1.cycle();
    }
}
