package com.InputOutput.StringIo;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-8
 * Time: 11:41:51
 * To change this template use File | Settings | File Templates.
 */
public class CharArrayReaderTest
{
    public static void main(String[] args) throws IOException
    {
        String temp="abcd";
        char[] ch=new char[temp.length()];
        temp.getChars(0,temp.length(),ch,0);
        CharArrayReader input=new CharArrayReader(ch);
        int i;
        while((i=input.read())!=-1)
        {
            System.out.println((char)i);
        }
    }
}
