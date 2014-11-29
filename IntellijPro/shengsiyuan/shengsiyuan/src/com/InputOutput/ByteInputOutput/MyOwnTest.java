package com.InputOutput.ByteInputOutput;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-5
 * Time: 22:18:20
 * To change this template use File | Settings | File Templates.
 */
public class MyOwnTest extends InputStream
{
    protected byte[] data;
    protected int ptr=0;
    protected int mark=0;

    public MyOwnTest(byte[] b)
    {
        this.data=b;
    }

    public int read()
    {
        return (ptr<data.length)?(data[ptr++]):-1;
    }

    @Override
    public int available() throws IOException
    {
         return data.length-ptr;
    }

    public void close() throws IOException
    {
        ptr=data.length;
    }

    public synchronized void mark(int readlimit)
    {
        mark=readlimit;
    }

    @Override
    public synchronized void reset() throws IOException
    {
        if(mark<0||mark>=data.length)
        {
            throw new IOException("the position is not valid");
        }
        ptr=mark;
    }

    @Override
    public boolean markSupported()
    {
        return true;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException
    {
        if(this.ptr>=data.length||len<0)
        {
            return -1;
        }
        if((this.ptr+len)>data.length)
        {
            len=data.length-this.ptr;
        }
        if(len==0)
        {
            return 0;
        }
        System.arraycopy(data,ptr,b,off,len);
        ptr+=len;
        return len;
        //return super.read(b, off, len);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public static void main(String[] args)
    {

    }
}
