package com.shengsiyuan2.Implements;

import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-17
 * Time: 10:54:30
 * To change this template use File | Settings | File Templates.
 */
public class Mycomparator implements Comparator{

    public int compare(Object o1, Object o2)
    {
        String s1=(String)o1;
        String s2=(String)o2;
        return s2.compareTo(s1);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
