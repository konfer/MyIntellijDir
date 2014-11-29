package com.NetWork;

import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-15
 * Time: 11:01:59
 * To change this template use File | Settings | File Templates.
 */
public class UrlTest
{
    public static void main(String[] args) throws MalformedURLException
    {
        URL url=new URL("http://java.sun.com:80/docs/books/tutorial/index.html#DOWN");

        String protocol=url.getProtocol();
        String host=url.getHost();
        String file=url.getFile();
        int port=url.getPort();
        String ref=url.getRef();
        System.out.println(protocol+","+host+","+file+","+port+","+ref);
    }
}
