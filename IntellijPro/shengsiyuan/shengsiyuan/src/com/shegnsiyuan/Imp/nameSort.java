package com.shegnsiyuan.Imp;

import com.shegnsiyuan.PersonTest;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-4
 * Time: 11:19:10
 * To change this template use File | Settings | File Templates.
 */
public class nameSort implements java.util.Comparator<PersonTest>
{
    private boolean desc;

    public boolean isDesc() {
        return desc;
    }

    public void setDesc(boolean desc) {
        this.desc = desc;
    }

    public int compare(PersonTest o1, PersonTest o2)
    {
        if(o1.getName()==o2.getName())
        {
            if(o1.getId()==o2.getId())
            {
                return 0;
            }
            return o1.getId()-o2.getId();
        }
        if(desc)
        {
            return o1.getName().compareTo(o2.getName());
        }
        else
        {
            return o2.getName().compareTo(o1.getName());
        }
       //return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
