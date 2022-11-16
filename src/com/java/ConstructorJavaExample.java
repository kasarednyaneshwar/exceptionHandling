package com.java;
class Person
{
    String name;
    int rollno;
    Person(String name, int rollno)
    {
        this.name=name;
        this.rollno=rollno;

    }
}
class Son extends Person
{
    int age;
    Son(int age,String name, int rollno)
    {
        super(name,age);
        this.age=age;
    }
}

public class ConstructorJavaExample
{
    public static void main(String[] args)
    {

            Son s = new Son(25, "Dnyaneshwar", 100);



    }
}
