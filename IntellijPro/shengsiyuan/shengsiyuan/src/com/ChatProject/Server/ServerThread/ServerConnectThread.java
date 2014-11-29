package com.ChatProject.Server.ServerThread;

import com.ChatProject.Server.Server;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-18
 * Time: 18:23:47
 * To change this template use File | Settings | File Templates.
 */
public class ServerConnectThread extends Thread
{
    private int port;
    private Server server;
    private ServerSocket serverSocket;
    private Socket socket;
    private InputStream inputStream;
    private OutputStream outputStream;

    public ServerConnectThread(int p, Server s)
    {
        this.port=p;
        this.server=s;
        try
        {
            serverSocket=new ServerSocket(port);
        }
        catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }


    public void run()
    {
        while(true)
        {
            try
            {
                socket=serverSocket.accept();
                inputStream=socket.getInputStream();
                outputStream=socket.getOutputStream();
                byte[] buf=new byte[1024];
                int length=inputStream.read(buf);
                String info=new String(buf,0,length);
                
            } 
            catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
    }

}
