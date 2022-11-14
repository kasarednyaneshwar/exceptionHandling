package com.java;
class A
{
    A get()
    {
        System.out.println("mass");
        return this;
    }
}
class B extends A
{
    B get()
    {
        System.out.println("new mass");

        return this;
    }
}
public class CovariantReturnTypeJava
{
    public static void main(String[] args)
    {
        B b=new B();
        b.get();
    }
}
