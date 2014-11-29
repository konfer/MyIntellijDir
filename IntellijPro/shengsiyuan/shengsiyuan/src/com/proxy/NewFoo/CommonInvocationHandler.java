package com.proxy.NewFoo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-16
 * Time: 21:12:26
 * To change this template use File | Settings | File Templates.
 */
public class CommonInvocationHandler implements InvocationHandler
{
    private Object target;

    public CommonInvocationHandler(Object obj)
    {
        this.target=obj;
    }

    public CommonInvocationHandler()
    {
        
    }

    public void setTarget(Object target)
    {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        return method.invoke(target,args);
        //return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
