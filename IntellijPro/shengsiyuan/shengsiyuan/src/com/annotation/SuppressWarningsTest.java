package com.annotation;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-18
 * Time: 21:47:15
 * To change this template use File | Settings | File Templates.
 */
public class SuppressWarningsTest
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        Map map=new TreeMap();    
    }

}
