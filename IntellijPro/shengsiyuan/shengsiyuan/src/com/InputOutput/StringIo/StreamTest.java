package com.InputOutput.StringIo;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-7
 * Time: 20:54:13
 * To change this template use File | Settings | File Templates.
 */
public class StreamTest
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fos=new FileOutputStream("file.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos) ;
        BufferedWriter bw=new BufferedWriter(osw);
        bw.write("http://www.google.com");
        bw.write("\n");
        bw.write("http://www.ifeng.com");
        bw.close();

    }
}
