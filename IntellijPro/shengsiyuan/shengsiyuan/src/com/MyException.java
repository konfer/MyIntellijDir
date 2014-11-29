package com;

import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-22
 * Time: 20:35:18
 * To change this template use File | Settings | File Templates.
 */
public class MyException
{
    public static void main(String[] args)
    {
        int c=0;
        try
        {
            int a=3;
            int b=0;
            c=a/b;
             System.out.println("helle world");
        }
        catch(ArithmeticException e)
        {
             e.printStackTrace();
        }
        finally
        {
            System.out.println("welcome");
        }

        System.out.println(c);
    }
}
