package com.proxy;

import com.proxy.Interface.Subject;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-10
 * Time: 23:14:12
 * To change this template use File | Settings | File Templates.
 */
public class RealSubject implements Subject
{

    public void request() {
        System.out.println("request");
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
