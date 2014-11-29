package com.NetWork;

import org.omg.CORBA.StringValueHelper;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-16
 * Time: 12:25:21
 * To change this template use File | Settings | File Templates.
 */
public class InetAddressTest
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        ServerSocket ss=new ServerSocket(5000) ;
        Socket s=ss.accept();
        InputStream is=s.getInputStream();
        byte[] buf=new byte[200];
        int length=is.read(buf);
        System.out.println(new String(buf,0,length));

       
//        while((length=is.read(buf,0,buf.length))!=-1)
//        {
//            String str=new String(buf,0,length) ;
//            System.out.println(str);
//        }
         //Thread.sleep(5000);
        System.out.println("Server begin");
        OutputStream os=s.getOutputStream();
        os.write("get it".getBytes());
        is.close();
        os.close();
        s.close();
    }
}
