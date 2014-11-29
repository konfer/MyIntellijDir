package com.NetWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-16
 * Time: 10:45:01
 * To change this template use File | Settings | File Templates.
 */
public class UrlConnectionTest
{
    public static void main(String[] args) throws IOException
    {
        URL url=new URL("http://www.sohu.com");
        InputStream in=url.openStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(in));
        String line=null;
        while((line=br.readLine())!=null)
        {
           System.out.println(line); 
        }
       br.close();

    }
}
