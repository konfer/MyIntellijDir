package com.shengsiyuan2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-18
 * Time: 10:38:32
 * To change this template use File | Settings | File Templates.
 */
public class CounterTest {

    public static void main(String[] args)
    {
        HashMap m =new HashMap();

        for(int i=0;i<args.length;i++)
        {
            if(m.get(args[i])==null)
            {
                m.put(args[i],new Integer(i));
            }
            else
            {
                Integer in=(Integer)(m.get(args[i]));
                int intX=in.intValue();
                intX++;
                m.put(args[i],new Integer(intX));
            }
        }

        Set s=m.keySet();

        for(Iterator iter=s.iterator();iter.hasNext();)
        {
            String key=(String)iter.next();
            Integer i=(Integer)m.get(key);

            System.out.println(key +": "+i);
        }

    }

}
