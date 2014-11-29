package com.ClassLoaderPro;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-21
 * Time: 10:48:13
 * To change this template use File | Settings | File Templates.
 */
public class Singleton
{
    public static int counter1;
    public static int counter2=0;
    private static Singleton sing=new Singleton();

    private Singleton()
    {
        counter1++;
        counter2++;
    }

    public static Singleton getInstance()
    {
        return sing;
    }

}

class Mytest2
{
    public static void main(String[] args)
    {
        Singleton s=Singleton.getInstance();
        System.out.println("counter1="+Singleton.counter1);   
        System.out.println("counter1="+Singleton.counter2);
    }
}