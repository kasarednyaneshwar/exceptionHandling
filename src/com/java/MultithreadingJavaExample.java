package com.java;
class Java
{
    public void methodJava()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Java Method");
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
class Android
{
    public void androidmethod()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Android Method");
            try
            {
                Thread.sleep(100);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }

}
public class MultithreadingJavaExample
{
    public static void main(String[] args)
    {

        Java j=new Java();

        j.methodJava();
        Android A=new Android();
        A. androidmethod();


    }
}
