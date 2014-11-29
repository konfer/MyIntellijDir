package com.ClassLoaderPro;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-25
 * Time: 13:49:22
 * To change this template use File | Settings | File Templates.
 */
public class ActionLoaderTest
{
    public int b=3;

    public ActionLoaderTest()
    {
        System.out.println("get ActionLoaderTest, loaded by "+this.getClass().getClassLoader());
    }

}
