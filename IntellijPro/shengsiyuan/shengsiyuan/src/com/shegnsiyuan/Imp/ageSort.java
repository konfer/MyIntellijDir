package com.shegnsiyuan.Imp;

import com.shegnsiyuan.PersonTest;

import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-4
 * Time: 10:56:32
 * To change this template use File | Settings | File Templates.
 */
public class ageSort implements Comparator<PersonTest>
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
        if(o1.getName().equals(o2.getName()))
        {
            if(o1.getId()==o2.getId())
            {
                return 0;
            }
            return o1.getId()-o2.getId();
        }
        if(desc)
        {
            return o1.getAge()-o2.getAge();
        }
        else
        {
            return o2.getAge()-o1.getAge();
        }

       // return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
