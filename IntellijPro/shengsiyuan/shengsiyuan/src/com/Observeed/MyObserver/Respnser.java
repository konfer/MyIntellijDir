package com.Observeed.MyObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-28
 * Time: 22:55:14
 * To change this template use File | Settings | File Templates.
 */
public class Respnser implements Observer
{
    public void update(Observable o, Object arg)
    {
        //System.out.println(name);
        if(((Integer)arg).intValue()<5)
        {
            System.out.println("ÏìÓ¦Æ÷ "+arg);
        }
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
