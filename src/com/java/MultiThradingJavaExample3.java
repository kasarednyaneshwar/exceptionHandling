package com.java;
class Tv implements Runnable
{
    public void run()
    {
        System.out.println("First Thraad");
    }
}
class Bulb implements Runnable
{
    public void run()
    {
        System.out.println("second ");
    }
}
public class MultiThradingJavaExample3
{
    public static void main(String[] args)
    {
        Runnable r=new Tv();
        Thread t=new Thread(r);
        t.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Runnable r2=new Bulb();
        Thread t1=new Thread(r2);

        t1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
