package com.ShengSiYuanCode.NetWork.ThreadNetWork;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-17
 * Time: 14:28:47
 * To change this template use File | Settings | File Templates.
 */
public class ServerInputThread extends Thread
{
    public Socket s ;

    public ServerInputThread(Socket socket)
    {
        this.s=socket;
    }

    public void run()
    {
        try
        {
            InputStream is=s.getInputStream();
            while(true)
            {
                byte[] buf=new byte[1024];
                int length=is.read(buf);
                String str=new String(buf,0,length) ;
                System.out.println(str);
            }

        }
        catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

}
