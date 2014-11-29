package com.ShengSiYuanCode.NetWork.ThreadNetWork;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-17
 * Time: 14:26:38
 * To change this template use File | Settings | File Templates.
 */
public class ServerThreadTest
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket ss=new ServerSocket(4000);
        while(true)
        {
            Socket socket=ss.accept();
            new ServerInputThread(socket).start();
            new ServerOutputThread(socket).start();
        }

        
    }
}
