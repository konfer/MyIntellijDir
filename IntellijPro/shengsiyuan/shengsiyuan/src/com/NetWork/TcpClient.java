package com.NetWork;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-16
 * Time: 20:22:39
 * To change this template use File | Settings | File Templates.
 */
public class TcpClient
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        Socket s=new Socket("127.0.0.1",5000);
        OutputStream os=s.getOutputStream();
        os.write("super".getBytes());
        InputStream is=s.getInputStream();
        byte[] buf=new byte[200];
        int length=0;
        Thread.sleep(15000);
        System.out.println("client begin");
        while((length=is.read(buf,0,buf.length))!=-1)
        {
            String str=new String(buf,0,length) ;
            System.out.println(str);
        }

        is.close();
        os.close();
        s.close();

    }
}
