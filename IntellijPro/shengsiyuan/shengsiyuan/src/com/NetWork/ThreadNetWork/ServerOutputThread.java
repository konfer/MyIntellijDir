package com.NetWork.ThreadNetWork;

import java.io.*;
import java.net.Socket;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-17
 * Time: 14:35:33
 * To change this template use File | Settings | File Templates.
 */
public class ServerOutputThread extends Thread
{
    public Socket s;

    public ServerOutputThread(Socket socket)
    {
        this.s=socket;
    }

    public void run()
    {
        try
        {
            OutputStream os=s.getOutputStream();
            while(true)
            {
                BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
                String line=reader.readLine();
                os.write(line.getBytes());
            }

        }
        catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }

}
