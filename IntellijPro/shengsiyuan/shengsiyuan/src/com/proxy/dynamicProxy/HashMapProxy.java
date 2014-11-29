package com.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-16
 * Time: 10:47:25
 * To change this template use File | Settings | File Templates.
 */
public class HashMapProxy implements InvocationHandler
{
    private  Object realMap;

    public HashMapProxy(Object obj)
    {
        this.realMap=obj;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println(args);
        String s1=args[1].toString();
        s1=s1+"y" ;
        args[1]=s1;
        method.invoke(realMap,args);
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public static Object factory(Object obj)
    {
        Class<?> classType=obj.getClass();
        return Proxy.newProxyInstance(classType.getClassLoader(),obj.getClass().getInterfaces(),new HashMapProxy(obj));
    }

    public static void main(String[] args)
    {
        HashMap h=new HashMap();
        Map map=(Map)factory(h);
        map.put(1,"lin");
        map.put(2,"yuan");
        Set<Map.Entry<Integer,String>> s=h.entrySet();
        for(Iterator<Map.Entry<Integer,String>> iter=s.iterator();iter.hasNext();)
        {
            Map.Entry<Integer,String> entry=iter.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

}
