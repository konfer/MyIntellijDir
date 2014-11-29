package com.MultiThread;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-13
 * Time: 22:26:42
 * To change this template use File | Settings | File Templates.
 */
public class IncreaseThread extends Thread
{
    private SampleTest s;

    public IncreaseThread(SampleTest sam)
    {
        this.s=sam;
    }

    public void run()
    {
        for(int i=0;i<20;i++)
        {
            try
            {
                Thread.sleep((long)Math.random()*1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            s.increased();
        }
    }

}
