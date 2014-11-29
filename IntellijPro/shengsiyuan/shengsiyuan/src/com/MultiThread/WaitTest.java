package com.MultiThread;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-13
 * Time: 22:32:08
 * To change this template use File | Settings | File Templates.
 */
public class WaitTest
{
    public static void main(String[] args)
    {
        SampleTest sam=new SampleTest();

        Thread t1=new IncreaseThread(sam);
        Thread t2=new DecreaseThread(sam);
        Thread t3=new IncreaseThread(sam);
        Thread t4=new DecreaseThread(sam);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
