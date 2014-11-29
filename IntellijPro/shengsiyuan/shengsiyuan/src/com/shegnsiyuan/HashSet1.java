package com.shegnsiyuan;

import com.shengsiyuan2.People;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-15
 * Time: 22:33:46
 * To change this template use File | Settings | File Templates.
 */
public class HashSet1 {

    public static void main(String[] args)
    {
        HashSet set=new HashSet();

        People p1=new People("zhangsan");
        People p2=new People("aa");
        People p3=new People("aa");

        set.add(p1);
        set.add(p2);
        set.add(p3);
    }

}
