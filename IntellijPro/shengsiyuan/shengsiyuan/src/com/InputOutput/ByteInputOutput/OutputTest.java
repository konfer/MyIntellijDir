package com.InputOutput.ByteInputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-3
 * Time: 11:25:30
 * To change this template use File | Settings | File Templates.
 */
public class OutputTest
{
    public static void main(String[] args) throws IOException
    {
        OutputStream os=new  FileOutputStream("d:\\OutPut.txt",true);
        String str="hello world good";
        byte[] buf=str.getBytes();

        os.write(buf);
        os.close();
    }
}
