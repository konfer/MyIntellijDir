package com.proxy.NewFoo;

import java.lang.reflect.Proxy;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-17
 * Time: 11:00:05
 * To change this template use File | Settings | File Templates.
 */
public class Demo
{
    private static void ImpAction(CommonInvocationHandler handler)
    {
        Foo f=null;
        f=(Foo)Proxy.newProxyInstance(Foo.class.getClassLoader(),new Class[]{Foo.class},handler) ;
        f.doAction();
    }

    public static void main(String[] args)
    {
        CommonInvocationHandler handler=new CommonInvocationHandler();

        handler.setTarget(new FooImpl());
        ImpAction(handler);
        handler.setTarget(new FooImpl2());
        ImpAction(handler);

    }
}
