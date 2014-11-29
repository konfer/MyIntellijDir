package com.Observeed.Interfaces;

import com.Observeed.Interfaces.Watcher;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-28
 * Time: 11:28:00
 * To change this template use File | Settings | File Templates.
 */
public interface Watched
{
    public void addWatcher(Watcher w);

    public void removeWatcher(Watcher w);

    public void notifyWatchers(String str);
}
