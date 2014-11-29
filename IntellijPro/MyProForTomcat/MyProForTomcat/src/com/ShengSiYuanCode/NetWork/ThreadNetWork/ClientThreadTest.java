package com.ShengSiYuanCode.NetWork.ThreadNetWork;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-17
 * Time: 14:42:44
 * To change this template use File | Settings | File Templates.
 */
public class ClientThreadTest
{
    public static void main(String[] args) throws IOException
    {
        Socket socket=new Socket("127.0.0.1",4000);
        new ClientInputThread(socket).start();
        new ClientOutputThread(socket).start();
    }

}
