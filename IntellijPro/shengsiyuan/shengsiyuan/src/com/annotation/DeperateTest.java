package com.annotation;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-18
 * Time: 21:31:49
 * To change this template use File | Settings | File Templates.
 */
public class DeperateTest
{
    public static void mainI(String[] args)
    {
        Date d=new Date();

        System.out.println(d.toLocaleString());
    }

    @Deprecated 
    public void doSomeThing()
    {
        System.out.println("do something");
    }

}
