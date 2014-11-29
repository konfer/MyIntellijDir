package com.shegnsiyuan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-28
 * Time: 21:34:47
 * To change this template use File | Settings | File Templates.
 */
public class MapTest
{
    public static void main(String[] args)
    {
        Map<String ,String> map=new HashMap<String,String>();

        map.put("a","aa");
        map.put("b","bb");
        map.put("c","cc");
        map.put("d","dd");

        Set<String> set=map.keySet();

        for(Iterator<String> iter=set.iterator();iter.hasNext();)
        {
            String key=iter.next();
            String value=map.get(key);

            System.out.println(key+": "+value);
        }

        Set<Map.Entry<String,String>> s=map.entrySet();

        for(Iterator<Map.Entry<String,String>> iter=s.iterator();iter.hasNext();)
        {
            Map.Entry<String ,String> entry=iter.next();

            String key=entry.getKey();
            String value=entry.getValue();

            System.out.println(key+" "+value);
        }

    }


}
