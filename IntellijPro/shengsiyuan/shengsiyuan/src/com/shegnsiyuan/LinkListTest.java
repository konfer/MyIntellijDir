package com.shegnsiyuan;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-15
 * Time: 12:56:57
 * To change this template use File | Settings | File Templates.
 */
public class LinkListTest {

    public static void main(String[] args)
    {
        LinkedList list=new LinkedList();

        list.add("F");
        list.add("F");
        list.add("E");

        list.addLast("z");
        list.addFirst("x");
        list.add(0,"A2");

       System.out.println(list);

        Object value=list.get(2);
        list.set(2,(String)value+" changed");

        System.out.println(list);

    }

}
