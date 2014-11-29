package com.shegnsiyuan;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-5
 * Time: 10:36:01
 * To change this template use File | Settings | File Templates.
 */
public class CountTest
{
    public void main(String[] args)
    {
        List<String> arr=new ArrayList<String>();

        Map<String,Integer> map=new HashMap<String,Integer>();

        for(String str:arr)
        {
            Integer i=map.get(str);
            map.put(str,((i==null)? 1:i+1));
        }

    }
}
