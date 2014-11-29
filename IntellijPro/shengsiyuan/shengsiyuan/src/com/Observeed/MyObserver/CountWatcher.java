package com.Observeed.MyObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-28
 * Time: 20:41:15
 * To change this template use File | Settings | File Templates.
 */
public class CountWatcher implements Observer
{
    public void update(Observable o, Object arg)
    {
        //System.out.println(name);
       System.out.println("¼ÆÊýÆ÷ "+arg);
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
