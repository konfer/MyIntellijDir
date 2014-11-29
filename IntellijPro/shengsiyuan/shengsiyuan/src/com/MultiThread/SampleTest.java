package com.MultiThread;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-13
 * Time: 10:38:34
 * To change this template use File | Settings | File Templates.
 */
public class SampleTest
{
    private int number;

    public synchronized void increased()
    {
        while(number!=0)
        {
            try
            {
                wait() ;
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        number++;
        System.out.println(number);
        notify();
    }

    public synchronized void decreased()
    {
        while(number==0)
        {
            try
            {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        number--;
        System.out.println(number);
        notify();
    }

    public static void main(String[] args)
    {
        
    }


}
