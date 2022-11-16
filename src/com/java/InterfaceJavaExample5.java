package com.java;
interface Vehicles
{
    public void typeOfVehicle();
}
class cycle implements Vehicles
{
    public void typeOfVehicle()
    {
        System.out.println("Cycle is my first vehicle");
    }

}
class Hero implements Vehicles
{
    public void typeOfVehicle()
    {
        System.out.println("Hero motor cycle is my second vehicle");
    }
}
public class InterfaceJavaExample5
{
    public void buy(Vehicles v)
    {
        v.typeOfVehicle();
    }
    public static void main(String[] args)
    {
        InterfaceJavaExample5 n=new InterfaceJavaExample5();
        n.buy(new Hero());
        n.buy(new cycle());
        n.buy(new Vehicles()
        {
            public void typeOfVehicle()
            {
                System.out.println("i think buy an Land Lover is my third vehicle");
            }
        });



    }
}
