package com.Reflect;

import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-6
 * Time: 21:51:12
 * To change this template use File | Settings | File Templates.
 */
public class InvokeTest
{
    public int add(int par1,int par2)
    {
        return par1+par2;
    }

    public String echo(String message)
    {
        return "hello"+message;
    }

    public static void main(String[] args)  throws Exception
    {
        Class<?> classType =InvokeTest.class;
        Object invokeTest=classType.newInstance();
        System.out.println(invokeTest instanceof InvokeTest);
        Method addMethod=classType.getMethod("add",new Class[]{int.class,int.class});
        Object result=addMethod.invoke(invokeTest,new Object[]{1,2});
        System.out.println((Integer)result);
        System.out.println("______________") ;
        Method echoMethod=classType.getMethod("echo",new Class[]{String.class});
        Object result2=echoMethod.invoke(invokeTest,new Object[]{" tom"});
        System.out.println((String)result2);
    }

}
