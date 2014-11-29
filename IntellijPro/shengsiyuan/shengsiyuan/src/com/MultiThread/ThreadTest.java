package com.MultiThread;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-10
 * Time: 21:26:14
 * To change this template use File | Settings | File Templates.
 */
public class ThreadTest
{
    public static void main(String[] args)
    {
        Thread1 t=new Thread1("first") ;
        Thread2 t1=new Thread2("second");
//        Thread t3=new Thread(new MyThread1());
//        Thread t4=new Thread(new MyThread());

        t1.start();
        t.start();
       // t3.start();
        //t4.start();

    }
}

class Thread1 extends Thread
{
    public Thread1(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        for(int i=0;i<15;i++)
        {
            System.out.println("t1 "+i);
        }
    }
}

class Thread2 extends Thread
{
    public Thread2(String name)
    {
        super(name);
    }
    
    @Override
    public void run()
    {
        for(int i=0;i<15;i++)
        {
            System.out.println("t2 "+i);
        }
    }
}

class MyThread1 implements Runnable
{
    public void run()
    {
        for(int i=0;i<20;i++)
        {
            System.out.println("hello "+i);
        }
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

class MyThread implements Runnable
{
    public void run()
    {
        for(int i=0;i<20;i++)
        {
           System.out.println("t3 "+i) ;
        }

        //To change body of implemented methods use File | Settings | File Templates.
    }
}

