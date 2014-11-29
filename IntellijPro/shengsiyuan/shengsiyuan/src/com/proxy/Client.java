package com.proxy;

import com.proxy.Interface.Subject;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-10
 * Time: 23:21:40
 * To change this template use File | Settings | File Templates.
 */
public class Client
{
    public static void main(String[] args)
    {
        Subject su=new ProxySubject();

        su.request();
        
    }

}
