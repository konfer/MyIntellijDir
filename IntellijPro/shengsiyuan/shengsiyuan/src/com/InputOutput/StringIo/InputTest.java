package com.InputOutput.StringIo;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-7
 * Time: 21:22:01
 * To change this template use File | Settings | File Templates.
 */
public class InputTest
{
    public static void main(String[] args) throws IOException
    {
        InputStream fis=new FileInputStream("file.txt");
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);
        String str=br.readLine();
        while(str!=null)
        {
            System.out.println(str);
            str=br.readLine();
        }

        br.close();


    }
}
