package com.ClassLoaderPro;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-22
 * Time: 10:39:50
 * To change this template use File | Settings | File Templates.
 */
public class ClassTest
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class cl=Class.forName("java.lang.String");
        System.out.println(cl.getClassLoader());
        Class cl1=Class.forName("com.ClassLoaderPro.ClassTest");
        System.out.println(cl1.getClassLoader());
    }

}

class c
{
    
}
