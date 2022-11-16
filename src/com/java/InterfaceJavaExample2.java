package com.java;
interface Bank
{
    public void rateOfInterest();
}
class HDFC implements Bank
{
    public void rateOfInterest()
    {
        System.out.println("Rate of interest of SBI is 0.04%");
    }
}
class NationalBank implements Bank
{
    public void rateOfInterest()
    {
        System.out.println("Rate of interest of SBI is 0.055%");
    }
}
public class InterfaceJavaExample2
{
    public void applyLoan(Bank bank)
    {
        bank.rateOfInterest();
    }

    public static void main(String[] args)
    {
        InterfaceJavaExample2 i=new InterfaceJavaExample2();
        i.applyLoan(new HDFC());
        i.applyLoan(new NationalBank());
        i.applyLoan(new Bank()
        {
            public void rateOfInterest()
            {
                System.out.println("axis bank Rate of interest is 0.04%");
            }
        });

    }
}

