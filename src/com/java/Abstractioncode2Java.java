package com.java;
abstract class ReservBankOfIndia
{
    abstract int rateOfInterest();
    public void simple()
    {
        System.out.println("These is abstract class method");
    }

}
class SBI extends ReservBankOfIndia
{
    public int rateOfInterest()
    {
        System.out.println( );

            return 8;

    }
}
class PunjabNationalBank extends ReservBankOfIndia
{
    public int rateOfInterest()
    {
         System.out.println( );
         return 9;
    }

}
public class Abstractioncode2Java
{
    public static void main(String[] args)
    {
        ReservBankOfIndia r=new SBI();
        ReservBankOfIndia r1=new PunjabNationalBank();
       System.out.println("Rate of interest of SBI is :" +r.rateOfInterest() +"%");
        System.out.println("Rate of interest of SBI is :"+ r1.rateOfInterest()+"%");


    }
}
