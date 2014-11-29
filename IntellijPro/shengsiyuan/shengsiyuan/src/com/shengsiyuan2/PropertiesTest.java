package com.shengsiyuan2;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-19
 * Time: 19:01:30
 * To change this template use File | Settings | File Templates.
 */
public class PropertiesTest {

    public static void main(String[] args)
    {
        Properties pro=System.getProperties();

        Set s=(Set)pro.keySet();

        for(Iterator iter=s.iterator();iter.hasNext();)
        {
            String key=(String)iter.next();
            String value=pro.getProperty(key);

            System.out.println(key+": "+value);
        }

    }

}
