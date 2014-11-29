package com.ClassLoaderPro;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-22
 * Time: 20:40:39
 * To change this template use File | Settings | File Templates.
 */
public class Test
{
    static
    {
        System.out.println("get test") ;
    }

    public static void main(String[] args)
    {
        Parent2 p;
        System.out.println("___________");
        p=new Parent2();
        System.out.println(Parent2.a);
        System.out.println(Child2.b);

    }

}

class Parent2
{
    static int a=3;
    static
    {
        System.out.println("Parent2 get it");
    }
}

class Child2 extends Parent2
{
    static int b=4;
    static
    {
        System.out.println("Child2 get it"); 
    }
}

