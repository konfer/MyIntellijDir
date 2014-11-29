package com.Observeed;

import com.Observeed.Interfaces.Watcher;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-28
 * Time: 11:34:05
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteWatcher implements Watcher
{
    private String name;

    public ConcreteWatcher(String name)
    {
        this.name=name;
    }

    public void update(String str)
    {
        System.out.println(name+" " +str);
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
