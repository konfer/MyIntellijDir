package com.Reflect;

import java.lang.reflect.*;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-8
 * Time: 16:06:14
 * To change this template use File | Settings | File Templates.
 */
public class privateTest
{
    private String name="zhangsan";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String sayHello(String name)
    {
        return "hello: "+name; 
    }
    
}

class PrivateDeomo
{
    public static void main(String[] args) throws Exception
    {
        privateTest p=new privateTest();
        Class<?> classType=p.getClass();
        Method m=classType.getDeclaredMethod("sayHello",new Class[]{String.class});
        m.setAccessible(true);
        String str=(String)m.invoke(p,"sa");
        System.out.println(str);
        Field f=classType.getDeclaredField("name");
        f.setAccessible(true);
        f.set(p,"lisi");
        Method m1=classType.getMethod("getName",new Class[]{});
        String str1=(String)m1.invoke(p);
        System.out.println(str1);
    }
}