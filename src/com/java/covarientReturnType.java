package com.java;
class man
{
     public man sum()
    {
        System.out.println("add these two number");

        return null;
    }
    public man division()
    {
        System.out.println("Division of two number");
        return null;
    }
}
class Result extends man
{

    public Result addition()
    {
        System.out.println("These is addition of two number");
        return null;
    }
}
public class covarientReturnType
{
    public static void main(String[] args)
    {
     Result r=new Result();
     r.addition();
     r.sum();
     r.division();

    }
}
