package com.annotation;

import com.annotation.myAnnotation.MyAnnotation;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-20
 * Time: 23:05:07
 * To change this template use File | Settings | File Templates.
 */
@MyAnnotation(val="liny",_val="yuan")
public class MyTest
{
    @Deprecated
    @SuppressWarnings("unchecked")
    public void output()
    {
        System.out.println("get it");
    }
}
