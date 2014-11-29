package com.proxy.dynamicProxy;

import com.proxy.Interface.Subject;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-14
 * Time: 20:45:26
 * To change this template use File | Settings | File Templates.
 */
public class RealSubject implements Subject {
    public void request()
    {
        System.out.println("From real subject");
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
