package com.MultiThread;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-10
 * Time: 22:44:18
 * To change this template use File | Settings | File Templates.
 */
public class ThreadTest2
{
    public static void main(String[] args)
    {
       // new Thread(new MyThreadTest()).start();
        Thread t1=new Thread(new MyThreadTest2());
        Thread t2=new Thread(new MyThreadTest());
        t2.start();
        t1.start();
        
//        Thread t2=new Thread(new MyThread());
//
//        t2.start();
//        t1.start();
    }
}

class MyThreadTest implements Runnable
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("t1:"+i);
        }
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

class MyThreadTest2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<500;i++)
        {
            System.out.println("t2:"+i);
        }
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

