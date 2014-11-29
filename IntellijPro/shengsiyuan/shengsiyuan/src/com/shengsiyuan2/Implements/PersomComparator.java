package com.shengsiyuan2.Implements;

import com.shengsiyuan2.Person;

import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-17
 * Time: 11:04:40
 * To change this template use File | Settings | File Templates.
 */
public class PersomComparator implements Comparator {


    public int compare(Object o1, Object o2)
    {
        Person p1=(Person)o1;
        Person p2=(Person)o2;
        if(p1.score>p2.score)
        {
            return 1;
        }
        else if(p1.score<p2.score)
        {
            return -1;
        }
        else
        {
             return 0;
        }    //To change body of implemented methods use File | Settings | File Templates.
    }
}
