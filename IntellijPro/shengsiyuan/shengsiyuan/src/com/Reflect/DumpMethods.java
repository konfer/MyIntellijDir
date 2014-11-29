package com.Reflect;

import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-6
 * Time: 13:10:29
 * To change this template use File | Settings | File Templates.
 */
public class DumpMethods
{
    public static void main(String[] args) throws Exception
    {
        Class<?> classType=Class.forName("java.lang.String");
        Method[] methods=classType.getDeclaredMethods();

        for(Method m:methods)
        {
            System.out.println(m);
        }
                
    }
}
