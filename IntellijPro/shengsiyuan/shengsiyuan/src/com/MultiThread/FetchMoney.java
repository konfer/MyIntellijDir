package com.MultiThread;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-11
 * Time: 21:05:07
 * To change this template use File | Settings | File Templates.
 */
public class FetchMoney
{
    public static void main(String[] args)
    {
//        Bank bank=new Bank();
//
//        Thread t1=new MoneyThread(bank);
//        Thread t2=new MoneyThread(bank);

        Example e=new Example();
        TheThread t1=new TheThread(e);
        TheThread2 t2=new TheThread2(e);

        t1.start();
        t2.start();
    }


}

class Bank
{
    private int money=1000;

    public synchronized int  getMoney(int number) throws InterruptedException
    {
        if(number<0)
        {
            return 0;
        }
        else if(number>money)
        {
            return money;
        }
        else
        {
            Thread.sleep(2000);
            money-=number;
            return number;
        }
    }
}

class Example
{
    public static synchronized void execute()
    {
        for(int i=0;i<10;i++)
        {
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("example:"+i);
        }
    }

    public static synchronized void execute1()
    {
        for(int i=0;i<10;i++)
        {
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("example1:"+i);
        }
    }

}

class TheThread extends Thread
{
    private Example example;

    public TheThread(Example exa)
    {
        this.example=exa;
    }

    public void run()
    {
        example.execute();
    }

}

class TheThread2 extends Thread
{
    private Example example;

    public TheThread2(Example exa)
    {
        this.example=exa;
    }

    public void run()
    {
        example.execute1();
    }

}


