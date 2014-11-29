package com.Observeed.MyObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-28
 * Time: 21:46:46
 * To change this template use File | Settings | File Templates.
 */
public class MyTest
{
    public static void main(String[] args)
    {
        Observable obs=new MySubject();
        Observer counter=new CountWatcher();
        Observer responser=new Respnser();
        obs.addObserver(counter);
        obs.addObserver(responser);

        for(int i=10;i>0;i--)
        {
            obs.notifyObservers();
        }

    }
}
