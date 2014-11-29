package com.Reflect;


import java.lang.reflect.Array;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-7
 * Time: 20:33:51
 * To change this template use File | Settings | File Templates.
 */
public class ArrayTester
{
    public static void main(String[] args)
    {
        Class<?> classType=String.class;

        Object array= Array.newInstance(classType,10);

        Array.set(array,5,"hello");

        String str=(String)Array.get(array,5);

        System.out.println(str);
    }
}
