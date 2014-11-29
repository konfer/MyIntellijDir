package com.proxy.dynamicProxy;

import com.proxy.Interface.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-14
 * Time: 20:51:18
 * To change this template use File | Settings | File Templates.
 */
public class Client
{
    public static void main(String[] args)
    {
        RealSubject realSubject=new RealSubject();
        InvocationHandler handler=new DymamicSubject(realSubject);
        Class<?> classType=handler.getClass();
        Subject sub=(Subject)Proxy.newProxyInstance(classType.getClassLoader(),realSubject.getClass().getInterfaces(),handler);
        sub.request();
        System.out.println(sub.getClass());
    }

}
