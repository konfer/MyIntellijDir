package com.shegnsiyuan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-27
 * Time: 13:02:43
 * To change this template use File | Settings | File Templates.
 */
public class ArrayList4
{
    public static void main(String[] args)
    {
        List<String> list=new ArrayList<String>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for(int i=0;i<list.size();i++)
        {
            String value=list.get(i);
            System.out.println(value);
        }

        for(Iterator<String> iter=list.iterator();iter.hasNext();)
        {
            String value=iter.next();
            System.out.println(value);
        }


    }


}
