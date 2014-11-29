package com.shegnsiyuan.Imp;

import com.shegnsiyuan.PersonTest;

import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-4
 * Time: 11:26:59
 * To change this template use File | Settings | File Templates.
 */
public class idSort implements Comparator<PersonTest>
{
    private boolean desc;

    public int compare(PersonTest o1, PersonTest o2)
    {
        if(desc)
        {
            return o1.getId()-o2.getId();
        }
        else
        {
            return o2.getId()-o1.getId();
        }
        //return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
