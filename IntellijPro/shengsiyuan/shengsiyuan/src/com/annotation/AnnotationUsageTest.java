package com.annotation;

import com.annotation.myAnnotation.AnnotationTest;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-18
 * Time: 22:10:55
 * To change this template use File | Settings | File Templates.
 */
@AnnotationTest(value="lin",value2=EnumTest.Perfect)
public class AnnotationUsageTest
{
    public void method()
    {
        System.out.println("usage of annotation");
    }

    public static void main(String[] args)
    {
        
    }

}
