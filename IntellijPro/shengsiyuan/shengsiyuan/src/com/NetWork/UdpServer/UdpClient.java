package com.NetWork.UdpServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-17
 * Time: 18:06:20
 * To change this template use File | Settings | File Templates.
 */
public class UdpClient
{
    public static void main(String[] args) throws IOException
    {
        DatagramSocket DSocket=new DatagramSocket(7000);
        byte[] buf=new byte[1000];
        DatagramPacket dp=new DatagramPacket(buf,1000);
        DSocket.receive(dp);
        System.out.println(dp.getPort());
        String str=new String(buf,0,dp.getLength());
        System.out.println(str);
//        System.out.println("-----------");
//        str="get it";
//        DatagramPacket dPacket=new DatagramPacket(str.getBytes(),str.length(),dp.getAddress(),dp.getPort());
//        DSocket.send(dPacket);
//        DSocket.close();
    }

}
