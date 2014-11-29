package com.InputOutput.ByteInputOutput;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-4
 * Time: 20:23:50
 * To change this template use File | Settings | File Templates.
 */
public class ByteArrayOutputStreamTest
{
    public static void main(String[] args) throws IOException
    {
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        String str="abcdef";
        byte[] b=str.getBytes();
        bos.write(b);
        byte[] result=bos.toByteArray() ;
        OutputStream os=new FileOutputStream("d:\\abcd.txt");
        BufferedOutputStream boss=new BufferedOutputStream(os);
        bos.writeTo(boss);
        boss.close();
        os.close();
        bos.close();
    }
}
