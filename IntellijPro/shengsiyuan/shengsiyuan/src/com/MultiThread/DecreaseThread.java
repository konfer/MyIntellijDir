package com.MultiThread;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-13
 * Time: 22:35:15
 * To change this template use File | Settings | File Templates.
 */
public class DecreaseThread extends Thread
{
    private SampleTest sam;

    public DecreaseThread(SampleTest s)
    {
        this.sam=s;
    }

    public void run()
    {
        for(int i=0;i<20;i++)
        {
            try
            {
                Thread.sleep((long)Math.random()*1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            sam.decreased();
        }

    }

}
