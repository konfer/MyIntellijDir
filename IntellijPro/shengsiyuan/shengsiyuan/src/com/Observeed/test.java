package com.Observeed;

import com.Observeed.Interfaces.Watched;
import com.Observeed.Interfaces.Watcher;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-28
 * Time: 11:27:05
 * To change this template use File | Settings | File Templates.
 */
public class test
{
    public static void main(String[] args)
    {
        Watched girl=new ConcreteWatched();

        Watcher boy1=new ConcreteWatcher("boy1");
        Watcher boy2=new ConcreteWatcher("boy2");
        Watcher boy3=new ConcreteWatcher("boy3");

        girl.addWatcher(boy1);
        girl.addWatcher(boy2);
        girl.addWatcher(boy3);

        girl.notifyWatchers("good");

        girl.removeWatcher(boy1);

        girl.notifyWatchers("bad");

    }
}
