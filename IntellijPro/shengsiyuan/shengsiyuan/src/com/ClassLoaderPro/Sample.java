package com.ClassLoaderPro;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-25
 * Time: 13:44:42
 * To change this template use File | Settings | File Templates.
 */
public class Sample
{
    public int a=1;

    public Sample()
    {
        System.out.println("get Sample ,loaded by "+this.getClass().getClassLoader());
        new ActionLoaderTest();
    }
}
