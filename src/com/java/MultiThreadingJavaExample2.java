package com.java;
class Four extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Single Thread");
            try
            {
                Thread.sleep(500);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }

}
class Five extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Double Thread");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
public class MultiThreadingJavaExample2
{
    public static void main(String[] args)
    {
        Thread t=new Four();
        t.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Thread t1=new Five();
        t1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
