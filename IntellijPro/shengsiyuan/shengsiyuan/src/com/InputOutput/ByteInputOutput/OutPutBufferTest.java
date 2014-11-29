package com.InputOutput.ByteInputOutput;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-4
 * Time: 12:44:36
 * To change this template use File | Settings | File Templates.
 */
public class OutPutBufferTest
{
    public static void main(String[] args) throws IOException
    {
        OutputStream os=new FileOutputStream("d:\\OutPut.txt",true);
        BufferedOutputStream bos=new BufferedOutputStream(os);
        bos.write(" http://www".getBytes());
        bos.close();
        os.close();
    }

}
