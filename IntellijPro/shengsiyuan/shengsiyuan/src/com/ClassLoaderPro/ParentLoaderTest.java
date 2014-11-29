package com.ClassLoaderPro;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-25
 * Time: 22:03:50
 * To change this template use File | Settings | File Templates.
 */
public class ParentLoaderTest
{
    public static void main(String[] args)
    {
        ClassLoader claLoader=ClassLoader.getSystemClassLoader();
        System.out.println(claLoader);
        while(claLoader!=null)
        {
            claLoader=claLoader.getParent();
            System.out.println(claLoader);
        }
    }
}
