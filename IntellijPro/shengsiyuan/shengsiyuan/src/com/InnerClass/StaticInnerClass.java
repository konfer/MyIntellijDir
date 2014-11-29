package com.InnerClass;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-29
 * Time: 12:13:12
 * To change this template use File | Settings | File Templates.
 */
public class StaticInnerClass
{
    private static int a=4;

    public static class Inner
    {
         public void test()
         {
             System.out.println(a);
         }
    }

}

class StaticInnerClassTest
{
    public static void main(String[] args)
    {
        StaticInnerClass.Inner inner=new StaticInnerClass.Inner();
        inner.test();
    }
}
