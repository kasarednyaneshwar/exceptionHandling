package com.java;
//by crating child class object automatically child class constructor and parent class constructor will call.
//but only child class  object is created not create parent class object
class Parent
{
    Parent()
    {
        System.out.println(this.hashCode());
    }
}
class Child extends Parent
{
    Child()
    {
        System.out.println(this.hashCode());
    }
}
public class JavaConstructorObjectExample
{

        public static void main(String[] args)
        {
           Child c=new Child();
           System.out.println(c.hashCode());

        }


    }

