package com.ClassLoaderPro;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-22
 * Time: 20:20:22
 * To change this template use File | Settings | File Templates.
 */
public class FinalTest
{
    public static final int x=2;
    static
    {
        System.out.println("get it");
    }
}

class Test2
{
    public static void main(String[] args)
    {
         System.out.println(FinalTest.x);
    }
}
