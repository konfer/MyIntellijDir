package com.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-15
 * Time: 9:57:18
 * To change this template use File | Settings | File Templates.
 */
public class VectorProxy implements InvocationHandler
{
    private Object proxyObj;

    public VectorProxy(Object obj)
    {
        this.proxyObj=obj;
    }

    public static Object factory(Object obj)
    {
        Class<?> classType=obj.getClass();
        return Proxy.newProxyInstance(classType.getClassLoader(),classType.getInterfaces(),new VectorProxy(obj));

    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println("before calling:" +method);
        if(null!=args)
        {
            for(Object obj:args)
            {
                System.out.println(obj);
            }
        }
        Object obj=method.invoke(proxyObj,args);
        System.out.println("after calling:"+method);
        return obj;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public static void main(String[] args)
    {
        List v=(List)factory(new Vector());
        System.out.println(v.getClass().getName());
        v.add("new");
        v.add("old");
    }

}