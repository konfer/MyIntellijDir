package com.InputOutput;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-29
 * Time: 21:33:45
 * To change this template use File | Settings | File Templates.
 */
public class MyTest
{
    public int compute(int number)
    {
        if(number==1)
        {
            return 1;
        }
        else
        {
            return number*compute(number-1);
        }
    }

    public static void main(String[] args)
    {
        MyTest m=new MyTest();
        System.out.println(m.compute(5));
    }

}
