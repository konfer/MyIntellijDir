package com.InputOutput.StringIo;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-9
 * Time: 22:07:51
 * To change this template use File | Settings | File Templates.
 */
public class CharSet
{
    public static void main(String[] args)
    {
        SortedMap<String,Charset> map=Charset.availableCharsets();
        Set<Map.Entry<String,Charset>> s=map.entrySet();
        for(Iterator<Map.Entry<String,Charset>> iter=s.iterator();iter.hasNext();)
        {
            Map.Entry<String,Charset> m=iter.next();
            System.out.println(m.getKey());
            
        }
    }
}
