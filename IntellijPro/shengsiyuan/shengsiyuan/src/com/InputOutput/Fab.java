package com.InputOutput;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-31
 * Time: 13:38:14
 * To change this template use File | Settings | File Templates.
 */
public class Fab
{
    public int compute(int number)
    {
        if(1==number||2==number)
        {
            return 1;
        }
        else
        {
            return compute(number-1)+compute(number-2);
        }
    }

    public static void main(String[] args)
    {
        Fab f=new Fab();
        System.out.println(f.compute(10));  
    }

}
