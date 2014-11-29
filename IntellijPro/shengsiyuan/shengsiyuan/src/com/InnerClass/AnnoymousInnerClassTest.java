package com.InnerClass;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-29
 * Time: 18:17:47
 * To change this template use File | Settings | File Templates.
 */
public class AnnoymousInnerClassTest
{
    @SuppressWarnings("deprecation")
    public String get(Date d)
    {
        return d.toLocaleString();
    }

    public static void main(String[] args)
    {
        AnnoymousInnerClassTest test=new AnnoymousInnerClassTest();
        String str=test.get(new Date()
        {
            public String toLocaleString()
            {
                return "override" ;
            }
        });
        System.out.println(str);
    }

}
