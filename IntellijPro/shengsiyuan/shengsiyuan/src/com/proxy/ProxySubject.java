package com.proxy;

import com.proxy.Interface.Subject;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-10
 * Time: 23:16:25
 * To change this template use File | Settings | File Templates.
 */
public class ProxySubject implements Subject
{
    private RealSubject realSubject;

    public void request()
    {
        this.preRequest();
        if(realSubject==null)
        {
            realSubject=new RealSubject();
        }
        realSubject.request();
        this.postRequest();
        //To change body of implemented methods use File | Settings | File Templates.
    }

    private void preRequest()
    {
        System.out.println("Pre request");
    }

    private void postRequest()
    {
        System.out.println("Post request");
    }

}
