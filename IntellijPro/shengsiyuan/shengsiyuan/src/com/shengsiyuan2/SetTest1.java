package com.shengsiyuan2;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-16
 * Time: 13:12:00
 * To change this template use File | Settings | File Templates.
 */
public class SetTest1 {

    public static void main(String[] args)
    {
        HashSet set =new HashSet();

        System.out.println(set.add("a"));
        set.add("b");
        set.add("c");
        System.out.println(set.add("a"));

        System.out.println(set);

    }

}
