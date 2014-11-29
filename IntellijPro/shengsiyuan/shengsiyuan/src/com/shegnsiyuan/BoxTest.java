package com.shegnsiyuan;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-5
 * Time: 10:29:03
 * To change this template use File | Settings | File Templates.
 */
public class BoxTest
{
    public static void main(String[] args)
    {
        int a=3;

        Collection<Integer> c=new ArrayList<Integer>();

        c.add(3);
        c.add(a+3);

        for(Integer i:c)
        {
            System.out.println(i);
        }

    }

}
