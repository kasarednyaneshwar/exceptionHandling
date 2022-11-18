package com.java;
/*class Mobile1 implements Runnable
{
    public void run()
    {
    }
}
class Mobile2 implements Runnable
{
    public void run()
    {
        System.out.println("second thread");
    }
}*/
public class MultithreadingJavaExample4
{
    public static void main(String[] args)
    {
        Runnable r=new Runnable(){
            @Override
            public void run()
            {
                System.out.println("first Thread");
            }
        };
        Runnable r2=new Runnable(){
            @Override
            public void run()
            {
                for(int i=0;i<5;i++)
                {
                    System.out.println(i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        };

        Thread t3=new Thread();
        t3.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
