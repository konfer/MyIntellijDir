package com.ClassLoaderPro;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-24
 * Time: 11:41:23
 * To change this template use File | Settings | File Templates.
 */
public class Test7
{
    public static void main(String[] args) throws Exception
    {
        ClassLoader loa=ClassLoader.getSystemClassLoader();
        Class<?> clazz=loa.loadClass("com.ClassLoaderPro.CL") ;
        System.out.println(clazz);
        System.out.println("_____________");
        clazz=Class.forName("com.ClassLoaderPro.CL");
        System.out.println(clazz);

    }
}

class CL
{
    public static int a=3;

    static
    {
        System.out.println("get CL");
    }

}
