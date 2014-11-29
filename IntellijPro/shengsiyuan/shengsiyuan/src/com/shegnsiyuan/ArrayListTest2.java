package com.shegnsiyuan;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-14
 * Time: 22:30:18
 * To change this template use File | Settings | File Templates.
 */
public class ArrayListTest2 {

    public static void main(String[] args)
    {
        ArrayList list=new ArrayList();

        list.add("hello");
        list.add(new Integer(2));

        String str=(String)list.get(0);
        Integer i=(Integer)list.get(1);

        System.out.println(str+i);

    }

}
