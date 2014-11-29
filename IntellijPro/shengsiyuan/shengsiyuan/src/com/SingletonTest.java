package com;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-15
 * Time: 23:23:12
 * To change this template use File | Settings | File Templates.
 */
public class SingletonTest extends Thread
{
    private static SingletonTest sing;

    private SingletonTest()
    {
        
    }

    public synchronized static SingletonTest getInstance()
    {
        if(null==sing)
        {
            try
            {
                Thread.sleep((long)Math.random()*2000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            sing=new SingletonTest();
        }
        return sing;

    }

    public static void main(String[] args)
    {
        new MySingThreadTest().start();
        new MySingThreadTest().start();
    }

}

class MySingThreadTest extends Thread
{
    public void run()
    {
        System.out.println(SingletonTest.getInstance());
    }
}
