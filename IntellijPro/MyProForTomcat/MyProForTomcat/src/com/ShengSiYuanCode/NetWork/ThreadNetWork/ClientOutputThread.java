package com.ShengSiYuanCode.NetWork.ThreadNetWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-17
 * Time: 14:44:37
 * To change this template use File | Settings | File Templates.
 */
public class ClientOutputThread extends Thread
{
    public Socket s;

        public ClientOutputThread(Socket socket)
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
