package com.ClassLoaderPro;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-22
 * Time: 20:33:52
 * To change this template use File | Settings | File Templates.
 */
public class Parent
{
    public static int a=3;
    static
    {
        System.out.println("Parent get it");
    }
}

class Child extends Parent
{
    public static int b=4;
    static
    {
        System.out.println("Child get it");
    }
}

class Test4
{
    static
    {
        System.out.println("test4 get it");
    }
    
    public static void main(String[] args)
    {
        System.out.println(Child.b);
    }
}