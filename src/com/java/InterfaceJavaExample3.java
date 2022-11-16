package com.java;
interface Country
{
    public void people();
}
class Maharashtra implements Country
{
    public void people()
    {
        System.out.println("most of people in Maharashtra are Marathi");
    }
}
class Gujarat implements Country
{
    public void people()
    {
        System.out.println("most of people in Gujarat are Gujarati");
    }

}
class Rajasthan implements Country
{
    public void people()
    {
        System.out.println("most of people in Rajasthan are banjara");
    }
}
public class InterfaceJavaExample3
{
    public void community(Country country )
    {
        country.people();
    }
    public static void main(String[] args)
    {
        InterfaceJavaExample3 m=new InterfaceJavaExample3();
        m.community(new Maharashtra());
        m.community(new Gujarat());
        m.community(new Rajasthan());
        m.community(new Country()
        {
            public void people()
            {
                System.out.println("most of the people in Tamilnadu is Tamil");
            }

        });

    }
}
