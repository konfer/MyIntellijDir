package com.InputOutput.ByteInputOutput;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-4
 * Time: 21:44:50
 * To change this template use File | Settings | File Templates.
 */
public class DataStream
{
    public static void main(String[] args) throws IOException
    {
        DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("d://abcde.txt")));
        byte b=3;
        int i=12;
        char ch='a';
        float f=3.3f;

        dos.writeByte(b);
        dos.writeInt(i);
        dos.writeChar(ch);
        dos.writeFloat(f);

        dos.close();

        DataInputStream dis=new DataInputStream(new BufferedInputStream(new FileInputStream("d://abcde.txt"))) ;

        System.out.println(dis.readByte());
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readFloat());

        dis.close();

    }
}
