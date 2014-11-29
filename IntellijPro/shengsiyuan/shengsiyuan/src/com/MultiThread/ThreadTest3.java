package com.MultiThread;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-11
 * Time: 11:55:27
 * To change this template use File | Settings | File Templates.
 */
public class ThreadTest3 implements Runnable
{
   // public int i;

    public void run()
    {
        int i=0;
        while(true)
        {
            try
            {
                System.out.println(i++);
                Thread.sleep((long)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            if(i==50)
            {
                break;
            }
        }
    }

}

class ThreadTest4
{
    public static void main(String[] args)
    {
        Runnable r=new ThreadTest3();
        Thread t1=new Thread(r);
        r=new ThreadTest3();
        Thread t2=new Thread(r);

        t1.start();
        t2.start();

//        new Thread(r).start();
//        new Thread(r).start();
    }
}
