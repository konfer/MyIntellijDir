package com.NetWork.UdpServer;

import java.io.IOException;
import java.net.*;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-17
 * Time: 17:27:44
 * To change this template use File | Settings | File Templates.
 */
public class UdpServerTest
{
    public static void main(String[] args) throws IOException, UnknownHostException
    {
        DatagramSocket DSocket=new DatagramSocket();
        String str="super";
        DatagramPacket p=new DatagramPacket(str.getBytes(),str.length(), InetAddress.getByName("localhost"),7000);
        DSocket.send(p);
//        byte[] buf=new byte[1000] ;
//        DatagramPacket packet=new DatagramPacket(buf,100);
//        DSocket.receive(packet);
//        String s=new String(buf,0,packet.getLength());
//        System.out.println(str);
        DSocket.close();
    }
}
