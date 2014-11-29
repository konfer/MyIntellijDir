package com.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-14
 * Time: 20:47:39
 * To change this template use File | Settings | File Templates.
 */
public class DymamicSubject implements InvocationHandler
{
    private Object realSub;

    public DymamicSubject(Object obj)
    {
        this.realSub=obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println("before calling: "+method);
        method.invoke(realSub,args);
        System.out.println("before calling: "+method);
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
