package com.Observeed;

import com.Observeed.Interfaces.Watched;
import com.Observeed.Interfaces.Watcher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-28
 * Time: 11:30:56
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteWatched implements Watched
{
    private List<Watcher> list=new ArrayList<Watcher>();

    public void addWatcher(Watcher w)
    {
        list.add(w);
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void removeWatcher(Watcher w)
    {
        list.remove(w);
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void notifyWatchers(String str)
    {
        for(Watcher w:list)
        {
            w.update(str);
        }
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
