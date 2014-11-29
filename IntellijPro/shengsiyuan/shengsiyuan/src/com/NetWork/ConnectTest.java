package com.NetWork;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-15
 * Time: 11:26:57
 * To change this template use File | Settings | File Templates.
 */
public class ConnectTest
{
    public static void main(String[] args) throws IOException
    {
        URL url=new URL("http://www.China-pub.com");
        URLConnection urlCon=url.openConnection();
        InputStream is=urlCon.getInputStream();
        OutputStream os=new FileOutputStream("xx.txt");
        byte[] buffer=new byte[2048];
        int length=0;
        while((length=is.read(buffer,0,buffer.length))!=-1)
        {
            os.write(buffer,0,length);
        }
    }

}
