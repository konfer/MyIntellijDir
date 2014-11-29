package com.Observeed.MyObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-28
 * Time: 20:35:12
 * To change this template use File | Settings | File Templates.
 */
public class MySubject extends Observable
{
    public int n=10;

    @Override
    public void addObserver(Observer o)
    {
       super.addObserver(o);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void notifyObservers()
    {
        super.setChanged();
        super.notifyObservers(n--);    //To change body of overridden methods use File | Settings | File Templates.
    }

//    public void sub(int number)
//    {
//        for(;number>0;number--)
//        {
//            setChanged();
//            notifyObservers(number);
//        }
//
//    }

}
