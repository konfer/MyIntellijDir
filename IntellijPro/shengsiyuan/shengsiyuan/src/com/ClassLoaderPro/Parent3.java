package com.ClassLoaderPro;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-22
 * Time: 21:29:42
 * To change this template use File | Settings | File Templates.
 */
public class Parent3
{
    static int a=3;
    static
    {
        System.out.println("get Parent3");
    }

    public static void doSomeThing()
    {
        System.out.println("Parent3 doSomething "+a);
    }

}

class Child3 extends Parent3
{
    static
    {
        System.out.println("get Child3");
    }
}

class Test6
{
    static
    {
        
    }

    public static void main(String[] args)
    {
        System.out.println(Child3.a);
        Child3.doSomeThing();
    }

}
