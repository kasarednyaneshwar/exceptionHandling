package com.java;
interface Name
{
    public void myName();

}
class Dnyaneshwar implements Name
{
    public void myName()
    {
        System.out.println("my full name is----");
    }
}
public class InterfaceJavaExample6
{
    public static void main(String[] args)
    {
     //   Name n=new Dnyaneshwar();
     //   n.myName();

        Name n=()->
        {
            System.out.println("my actual name is ---");
        };
        n.myName();

    }
}
