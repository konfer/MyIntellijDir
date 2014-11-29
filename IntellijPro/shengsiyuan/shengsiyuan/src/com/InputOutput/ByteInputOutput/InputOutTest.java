package com.InputOutput.ByteInputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-1
 * Time: 21:52:41
 * To change this template use File | Settings | File Templates.
 */
public class InputOutTest
{
    public static void main(String[] args) throws IOException
    {
        InputStream is=new FileInputStream("d:\\shengsiyuan\\abc.txt");
        int length=0;
        byte[] b=new byte[1024];
        while((length=is.read(b,0,1024))!=-1)
        {
            String str=new String(b,0,length);
            System.out.println(str);
        }
        is.close();
        
    }
}
