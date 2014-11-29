package com.InputOutput.StringIo;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-8
 * Time: 11:26:56
 * To change this template use File | Settings | File Templates.
 */
public class CharStream
{
    public static void main(String[] args) throws IOException {
        String str="I hate be forced to do anything";
        char[] buffer=new char[str.length()];
        str.getChars(0,str.length(),buffer,0);
        FileWriter f=new FileWriter("file2.txt");
        for(int i=0;i<buffer.length;i++)
        {
            f.write(buffer[i]);
        }
        f.close();
    }
}
