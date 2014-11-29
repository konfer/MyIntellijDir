package com.InputOutput.ByteInputOutput;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-5
 * Time: 10:47:13
 * To change this template use File | Settings | File Templates.
 */
public class MyByteArrayInputStream extends InputStream
{
    protected byte[] data;

    protected int ptr=0;

    public MyByteArrayInputStream(byte[] b)
    {
        this.data=b;
    }

    @Override
    public int read() throws IOException
    {
        return (ptr<data.length)? data[ptr++]:-1;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public static void main(String[] args) throws IOException {
        byte[] b=new byte[16];
        for(int i=0;i<b.length;i++)
        {
            b[i]=(byte)i;
        }
        MyByteArrayInputStream mbis=new MyByteArrayInputStream(b);
        while(true)
        {
            int c=mbis.read();
            if(c<0)
            {
                break;
            }
            System.out.println(c+" ");
        }
    }

}
