package com.shengsiyuan2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-17
 * Time: 14:53:51
 * To change this template use File | Settings | File Templates.
 */
public class MapTest1 {

    public static void main(String[] args)
    {
        HashMap map=new HashMap() ;

        int x=0;

        map.put(x,"zhansan");
        map.put("b","lisi");
        map.put("c","wangwu");
        map.put(x,"lisi");

        System.out.println(map);

        String value=(String)map.get("y");

        Set set=map.keySet();

        for(Iterator iter=set.iterator();iter.hasNext();)
        {
            Object obj=iter.next();
            String val=(String)map.get(obj);
            System.out.println(val);
        }

    }

}
