package com.java;
interface ElectronicThings
{
    public void component();
}
class Mobile implements ElectronicThings
{
    public void component()
    {
        System.out.println("mobile is a electronic things");
    }
}
class Fan implements  ElectronicThings
{
    public void component()
    {
        System.out.println("fan is a electronic things");

    }
}

public class InterfaceJavaExample4
{
    public void buy( ElectronicThings e)
    {
        e.component();
    }
    public static void main(String[]  args)
    {
        InterfaceJavaExample4 a=new InterfaceJavaExample4();
        a.buy(new Mobile());
        a.buy(new Fan());

        a.buy(new  ElectronicThings()
        {
            public void component()
            {
                System.out.println("We actually buy Refrigerator ia an  ElectronicThings ");
            }
        });
    }


}
