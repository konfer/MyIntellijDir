package com.shengsiyuan2;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-16
 * Time: 13:17:00
 * To change this template use File | Settings | File Templates.
 */
public class SetTest2 {

    public static void main(String[] args)
    {
        HashSet set=new HashSet();
//        set.add(new People("zhangsan")) ;
//        set.add(new People("lisi"));
//        set.add(new People("zhansan"));

        People p1=new People("LISI");
        People p2=new People("LISI");

        String s1=new String("aaa");
        String s2=new String("aaa");

        set.add(p1);                 
        set.add(p2);

        set.add(s1);
        set.add(s2);

        System.out.println(set);
        
    }

}
