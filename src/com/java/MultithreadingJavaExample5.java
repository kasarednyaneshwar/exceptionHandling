package com.java;

public class MultithreadingJavaExample5
{
    public static void main(String[] ares)
    {
        Runnable r=new Runnable()
        {
            @Override
            public void run()
            {
                for(int i=0;i<5;i++)
                {
                    System.out.println("Java");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        };
        Thread t=new Thread();
        t.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
